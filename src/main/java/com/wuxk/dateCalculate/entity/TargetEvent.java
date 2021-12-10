package com.wuxk.dateCalculate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 目标事件
 */
@Getter
@Setter
@ToString
public class TargetEvent {
    /** 目标事件Id */
    private String targetId;

    /** 目标事件 */
    private String targetEvent;

    /** 目标事件日期  YYYYMMDD */
    private String targetEventDay;

    /** 事件描述 */
    private String eventDesc;

    /** 逻辑删除 0：未删除 1：已删除 */
    private String logicDelete;
}
