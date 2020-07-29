package com.zj.advice.repository;

import com.zj.advice.domain.ZjAdvice;
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
public interface ZjAdviceMapper {
    int insert(ZjAdvice advice);
}
