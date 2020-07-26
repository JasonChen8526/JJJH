package com.zj.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
//EnableDiscoveryClient 可使用cloud适配的所有服务管理组件
//EnableEurekaClient只能在Eureka的服务管理组件中使用
//@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication(scanBasePackages = {"com.zj.api.*"})
public class ApiUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiUserApplication.class, args);
    }

}
