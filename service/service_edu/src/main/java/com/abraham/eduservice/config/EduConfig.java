package com.abraham.eduservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Abraham
 * @Date 2022/9/22 8:58
 * @Version 1.0
 */
@Configuration
@MapperScan("com.abraham.eduservice.mapper")
public class EduConfig {
}
