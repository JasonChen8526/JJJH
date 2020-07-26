package com.zj.user.controller;


import com.zj.user.service.IZjUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chenxinmin
 * @since 2020-07-26
 */
@RestController
@RequestMapping("/zjUser")
public class ZjUserController {
    @Resource
    private IZjUserService iZjUserService;

    @PostMapping("/insertUser")
    public int insertUser(){
        return iZjUserService.insertUser();
    }
}

