package com.pangzhao.prize.api.action;

import com.github.pagehelper.PageHelper;
import com.pangzhao.prize.commons.config.RedisKeys;
import com.pangzhao.prize.commons.db.entity.CardUser;
import com.pangzhao.prize.commons.db.entity.CardUserDto;
import com.pangzhao.prize.commons.db.entity.ViewCardUserHit;
import com.pangzhao.prize.commons.db.entity.ViewCardUserHitExample;
import com.pangzhao.prize.commons.db.mapper.CardUserGamesMapper;
import com.pangzhao.prize.commons.db.mapper.ViewCardUserHitMapper;
import com.pangzhao.prize.commons.utils.ApiResult;
import com.pangzhao.prize.commons.utils.PageBean;
import com.pangzhao.prize.commons.utils.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
@Api(tags = {"用户模块"})
public class UserController {

    @Resource
    private RedisUtil redisUtil;

    @Resource
    private ViewCardUserHitMapper hitMapper;

    @Resource
    private CardUserGamesMapper cardUserGamesMapper;

    @GetMapping("/info")
    @ApiOperation(value = "用户信息")
    public ApiResult info(HttpServletRequest request) {
        HttpSession session = request.getSession();
        CardUser user = (CardUser) redisUtil.get(RedisKeys.SESSIONID + session.getId());
        if (user == null) {
            return new ApiResult(0, "登录超时", null);
        } else {
            CardUserDto dto = new CardUserDto(user);
            dto.setGames(cardUserGamesMapper.getGamesNumByUserId(user.getId()));
            dto.setProducts(cardUserGamesMapper.getPrizesNumByUserId(user.getId()));
            return new ApiResult(1, "成功", dto);
        }
    }

    @GetMapping("/hit/{gameid}/{curpage}/{limit}")
    @ApiOperation(value = "我的奖品")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "gameid", value = "活动id（-1=全部）", dataType = "int", example = "1", required = true),
            @ApiImplicitParam(name = "curpage", value = "第几页", defaultValue = "1", dataType = "int", example = "1"),
            @ApiImplicitParam(name = "limit", value = "每页条数", defaultValue = "10", dataType = "int", example = "3")
    })
    public ApiResult hit(@PathVariable int gameid, @PathVariable int curpage, @PathVariable int limit, HttpServletRequest request) {
        HttpSession session = request.getSession();
        Integer userid = (Integer) session.getAttribute("loginUserId");
        if (userid == null) {
            return new ApiResult(0, "登录超时", null);
        }
        ViewCardUserHitExample example = new ViewCardUserHitExample();
        ViewCardUserHitExample.Criteria criteria = example.createCriteria().andUseridEqualTo(userid);
        if (gameid != -1) {
            criteria.andGameidEqualTo(gameid);
        }
        long total = hitMapper.countByExample(example);
        PageHelper.startPage(curpage, limit);
        List<ViewCardUserHit> all = hitMapper.selectByExample(example);
        return new ApiResult(1, "成功", new PageBean<ViewCardUserHit>(curpage, limit, total, all));
    }
}