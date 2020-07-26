package com.zj.data.service.impl;

import com.zj.data.domain.ZjData;
import com.zj.data.repository.ZjDataMapper;
import com.zj.data.service.IZjDataService;
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
public class ZjDataServiceImpl implements IZjDataService {
    @Resource
    private ZjDataMapper zjDataMapper;

    @Override
    public int insertData() {
        ZjData data = new ZjData();
        data.setContent("fdfddfd");
        return zjDataMapper.insert(data);
    }
}
