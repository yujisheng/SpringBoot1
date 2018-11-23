package com.baizhi.springboot1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.baizhi.springboot1.dao")
@SpringBootApplication
public class SpringBoot1Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot1Application.class);
    }
}
