package com.tianhe.spring.cloud.tianhe.service;

/**
 * Created by tianhe on 2019/9/4.
 * 公众号天河聊架构
 */
public interface ServiceRegistry {

    void register(String serviceId,String restPath);

    void deregister(String serviceId,String restPath);
}
