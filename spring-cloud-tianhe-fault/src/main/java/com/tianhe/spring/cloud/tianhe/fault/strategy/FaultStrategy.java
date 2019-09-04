package com.tianhe.spring.cloud.tianhe.fault.strategy;

import com.tianhe.spring.cloud.tianhe.fault.SeviceDetail;

import java.util.List;

/**
 * 容错策略顶层接口
 * Created by tianhe on 2019/9/4.
 * 公众号天河聊架构
 */
public interface FaultStrategy {

    void execute(List<SeviceDetail> serviceDetailList);
}
