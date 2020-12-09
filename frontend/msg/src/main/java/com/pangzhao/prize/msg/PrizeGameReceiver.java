package com.pangzhao.prize.msg;

import com.pangzhao.prize.commons.config.RabbitKeys;
import com.pangzhao.prize.commons.db.entity.CardUserGame;
import com.pangzhao.prize.commons.db.mapper.CardUserGameMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@RabbitListener(queues = RabbitKeys.QUEUE_PLAY)
public class PrizeGameReceiver {

    private final static Logger logger = LoggerFactory.getLogger(PrizeGameReceiver.class);

    @Resource
    private CardUserGameMapper cardUserGameMapper;

    @RabbitHandler
    public void processMessage3(CardUserGame message) {
        logger.info("user play : game={},user={},time={} ", message.getGameid(), message.getUserid(), message.getCreatetime());
        cardUserGameMapper.insert(message);
    }

}
