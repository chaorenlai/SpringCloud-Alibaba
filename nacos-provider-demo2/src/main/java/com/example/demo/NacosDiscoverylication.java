package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NacosDiscoverylication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoverylication.class, args);
    }

    @RestController
    static class TestController {

        @GetMapping("/echo")
        public String echo(String name) {
            return "provider:" + name;
        }

    }

}
