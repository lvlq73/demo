package com.llq.client.web.controller;

import com.llq.api.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvlianqi
 * @description
 * @date 2021/11/22
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @Autowired
    private IHelloService helloService;

    @GetMapping("hello")
    public String test(@RequestParam("name") String name) {
        return helloService.hello(name);
    }

    @GetMapping("sum")
    public int sum(@RequestParam("num") int num) {
        return helloService.sum(num, num);
    }
}
