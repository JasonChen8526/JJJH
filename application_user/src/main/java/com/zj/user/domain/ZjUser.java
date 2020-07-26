package com.zj.user.domain;

import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author chenxinmin
 * @since 2020-07-26
 */
@Data
public class ZjUser {
    private Integer id;
    private String userId;
    public Integer getId() {
        return id;
    }
}
