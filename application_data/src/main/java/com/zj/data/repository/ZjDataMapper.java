package com.zj.data.repository;

import com.zj.data.domain.ZjData;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author chenxinmin
 * @since 2020-07-26
 */
@Mapper
public interface ZjDataMapper {
    int insert(ZjData data);
}
