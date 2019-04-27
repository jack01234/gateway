package com.wmli.gateway;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 网关启动类
 *
 * @author yingmuhuadao
 * @date 2019/4/26
 */
@Slf4j
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    /**
     * 单元测试类
     *
     * @return 结果
     */
    @GetMapping(value = "/helloGateway")
    public String helloGateway(){
        log.info("hello gateway!!!");
        return "hello gateway!";
    }
}
