package com.llq.api;

import com.llq.netty.scan.RpcApi;

/**
 * @author lvlianqi
 * @description 测试rpc接口
 * @createDate 2019/11/27 21:14
 */
@RpcApi(alias = "helloService", serviceId = "service_test")
public interface IHelloService {

    String hello(String name);

    int sum(int one, int two);
}
