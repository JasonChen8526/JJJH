package com.zj.advice.controller;


import com.zj.advice.service.IZjAdviceService;
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
@RequestMapping("/zjAdvice")
public class ZjAdviceController {
    @Resource
    private IZjAdviceService iZjAdviceService;

    @PostMapping("/insertAdvice")
    public int insertAdvice(){
        iZjAdviceService.insertAdvice();
        return 1;
    }
}

