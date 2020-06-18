package com.ccb.ems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // springboot 入口类，且只能出现一次
@MapperScan("com.ccb.ems.dao")
public class Application {
    public static void main(String[] args) {
        // 启动springboot应用
        // 参数1：入口类类对象 参数2：main函数参数
        SpringApplication.run(Application.class, args);

    }
}
