package com.zj.advice.service.impl;

import com.zj.advice.domain.ZjAdvice;
import com.zj.advice.repository.ZjAdviceMapper;
import com.zj.advice.service.IZjAdviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author chenxinmin
 * @since 2020-07-26
 */
@Service
public class ZjAdviceServiceImpl implements IZjAdviceService {
    @Resource
    private ZjAdviceMapper zjAdviceMapper;

    @Override
    public void insertAdvice() {
        ZjAdvice advice = new ZjAdvice();
        advice.setName("fdfddfd");
        zjAdviceMapper.insert(advice);
    }
}
