package com.abraham.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Abraham
 * @Date 2022/9/22 8:53
 * @Version 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.abraham"})
public class EduApplication {
    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class,args);
    }
}
