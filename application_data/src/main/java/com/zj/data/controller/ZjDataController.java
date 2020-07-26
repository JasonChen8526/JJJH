package com.zj.data.controller;


import com.zj.data.service.IZjDataService;
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
@RequestMapping("/zjData")
public class ZjDataController {
    @Resource
    private IZjDataService iZjDataService;

    @PostMapping("/insertData")
    public int insertData(){
        return iZjDataService.insertData();
    }
}

