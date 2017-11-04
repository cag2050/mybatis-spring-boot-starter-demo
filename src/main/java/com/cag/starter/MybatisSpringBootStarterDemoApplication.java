package com.cag.starter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cag.mapper")
public class MybatisSpringBootStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringBootStarterDemoApplication.class, args);
    }
}
