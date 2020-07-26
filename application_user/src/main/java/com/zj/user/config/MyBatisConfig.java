package com.zj.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.zj.user.repository"})
public class MyBatisConfig {
}
