package com.zj.data.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.zj.data.repository"})
public class MyBatisConfig {
}
