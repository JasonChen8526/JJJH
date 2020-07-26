package com.zj.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 描述：
 *
 * @author: Administrator
 * @date: 2020/7/26 0026 21:35
 */
@FeignClient("application-data")
public interface ZjDataClient {
    @PostMapping("/zjData/insertData")
    int insertData();
}
