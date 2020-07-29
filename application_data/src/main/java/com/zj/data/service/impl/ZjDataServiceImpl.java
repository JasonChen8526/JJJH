package com.zj.data.service.impl;

import com.zj.data.domain.ZjData;
import com.zj.data.feign.ZjAdviceClient;
import com.zj.data.feign.ZjUserClient;
import com.zj.data.repository.ZjDataMapper;
import com.zj.data.service.IZjDataService;
import io.seata.spring.annotation.GlobalTransactional;
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
    @Resource
    private ZjUserClient zjUserClient;
    @Resource
    private ZjAdviceClient zjAdviceClient;

    @GlobalTransactional(name = "seata",rollbackFor = Exception.class)
    @Override
    public void insertData() {
        ZjData data = new ZjData();
        data.setContent("fdfddfd");
        zjDataMapper.insert(data);
        zjUserClient.insertUser();
        zjAdviceClient.insertAdvice();
        int i = 1/0;
    }
}
