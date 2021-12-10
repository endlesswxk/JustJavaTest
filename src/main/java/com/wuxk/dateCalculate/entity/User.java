package com.wuxk.dateCalculate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 用户类
 */
@Getter
@Setter
@ToString
public class User {

    /** 用户Id */
    private String userId;

    /** 用户名 */
    private String userName;

    /** 逻辑删除 0：未删除 1：已删除 */
    private Integer logicDelete;
}
