package com.llq.web.service;

import com.llq.api.IHelloService;
import com.llq.netty.scan.RpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author lvlianqi
 * @description HelloServiceImpl
 * @createDate 2019/12/12 20:57
 */
@RpcService(IHelloService.class)
@Service
public class HelloServiceImpl implements IHelloService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public String hello(String name) {
        logger.info("----------------接收："+name);
        return "Hello! " + name;
    }

    @Override
    public int sum(int one, int two) {
        logger.info("----------------接收："+ one + "+" + two);
        //Uninterruptibles.sleepUninterruptibly(3 , TimeUnit.SECONDS);
        return one + two;
    }
}
