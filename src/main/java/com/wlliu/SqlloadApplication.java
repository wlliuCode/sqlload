package com.wlliu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.wlliu.dao")
@SpringBootApplication
public class SqlloadApplication {
    public static void main(String[] args) {
        SpringApplication.run(SqlloadApplication.class);
    }
}
