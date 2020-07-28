package com.zj.api.controller;

import com.zj.api.feign.ZjDataClient;
import com.zj.api.feign.ZjUserClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述：
 *
 * @author: Administrator
 * @date: 2020/7/26 0026 21:33
 */
@RestController
@RequestMapping("/testSeataController")
public class TestSeataController {
    @Resource
    private ZjDataClient zjDataClient;

    @GetMapping("/test")
    public void test(){
        zjDataClient.insertData();
    }
}
