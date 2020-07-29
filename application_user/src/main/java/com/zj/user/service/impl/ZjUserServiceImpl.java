package com.zj.user.service.impl;

import com.zj.user.domain.ZjUser;
import com.zj.user.repository.ZjUserMapper;
import com.zj.user.service.IZjUserService;
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
public class ZjUserServiceImpl implements IZjUserService {
    @Resource
    private ZjUserMapper zjUserMapper;

    @Override
    public int insertUser() {
        ZjUser user = new ZjUser();
        user.setUserId("43343");
        zjUserMapper.insert(user);
        return 1;
    }
}
