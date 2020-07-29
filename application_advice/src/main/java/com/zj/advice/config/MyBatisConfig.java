package com.zj.advice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.zj.advice.repository"})
public class MyBatisConfig {
}
