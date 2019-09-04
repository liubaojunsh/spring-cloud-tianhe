package com.tianhe.spring.cloud.tianhe.loadbalance.strategy;

import com.tianhe.spring.cloud.tianhe.fault.SeviceDetail;

import java.util.List;

/**
 * Created by tianhe on 2019/9/4.
 * 公众号天河聊架构
 */
public class RoundRobinLoadBalance implements LoadBalanceStrategy{

    @Override
    public void execute(List<SeviceDetail> serviceDetailList) {

    }
}
