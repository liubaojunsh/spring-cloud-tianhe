package com.tianhe.spring.cloud.tianhe.service;

import java.util.List;

/**
 * Created by tianhe on 2019/9/4.
 * 公众号天河聊架构
 */
public interface DiscoveryClient {

    ServiceInstance getLocalServiceInstance();

    List<ServiceInstance> getInstanceList(String serviceId,String restPath);
}
