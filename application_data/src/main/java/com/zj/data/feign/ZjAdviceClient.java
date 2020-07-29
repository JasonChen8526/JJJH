package com.zj.data.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 描述：
 *
 * @author: Administrator
 * @date: 2020/7/26 0026 21:35
 */
@FeignClient("application-advice")
public interface ZjAdviceClient {
    @PostMapping("/zjAdvice/insertAdvice")
    int insertAdvice();
}
