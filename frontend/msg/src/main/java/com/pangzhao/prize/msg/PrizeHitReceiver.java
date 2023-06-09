package com.pangzhao.prize.msg;

import com.pangzhao.prize.commons.config.RabbitKeys;
import com.pangzhao.prize.commons.db.entity.CardUserHit;
import com.pangzhao.prize.commons.db.mapper.CardUserHitMapper;
import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Component
@RabbitListener(queues = RabbitKeys.QUEUE_HIT)
public class PrizeHitReceiver {
    private final static Logger logger = LoggerFactory.getLogger(PrizeHitReceiver.class);

    @Resource
    private CardUserHitMapper hitMapper;

    @RabbitHandler
    public void processMessage2(byte[] message) {
        logger.info("Receiver1 ===========> : " + new String(message));
    }

    @RabbitHandler
    public void processMessage3(Map message) {
        logger.info("user hit : " + message);
        CardUserHit hit = new CardUserHit();
        hit.setGameid(MapUtils.getIntValue(message, "gameid"));
        hit.setUserid(MapUtils.getIntValue(message, "userid"));
        hit.setProductid(MapUtils.getIntValue(message, "productid"));
        hit.setHittime(new Date(MapUtils.getLongValue(message, "hittime")));
        hitMapper.insert(hit);
    }

    @RabbitHandler
    public void processMessage2(CardUserHit message) {
        logger.info("user hit : game={},user={},product={},time={}", message.getGameid(), message.getUserid(), message.getProductid(), message.getHittime());
        hitMapper.insert(message);
    }
}