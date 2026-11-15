package com.example.hw4;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.hw4.repository")
public class Hw4Application {
    public static void main(String[] args) {
        SpringApplication.run(Hw4Application.class, args);
    }
}
