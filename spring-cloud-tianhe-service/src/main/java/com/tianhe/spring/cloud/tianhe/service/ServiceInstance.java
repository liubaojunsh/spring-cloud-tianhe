package com.tianhe.spring.cloud.tianhe.service;

/**
 * Created by tianhe on 2019/9/4.
 * 公众号天河聊架构
 */
public interface ServiceInstance {

    String getServiceId();

    String getHost();

    int getPort();

    String getRestPath();
}
