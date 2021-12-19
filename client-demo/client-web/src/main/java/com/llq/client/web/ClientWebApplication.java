package com.llq.client.web;

import com.llq.netty.register.spring.ApiSpringRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class ClientWebApplication {

    @Bean
    public ApiSpringRegister apiSpringRegister() {
        return new ApiSpringRegister(Arrays.asList("com.llq.api"));
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientWebApplication.class, args);
    }

}
