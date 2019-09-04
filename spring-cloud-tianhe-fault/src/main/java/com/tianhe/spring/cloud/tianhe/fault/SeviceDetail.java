package com.tianhe.spring.cloud.tianhe.fault;


import lombok.Getter;
import lombok.Setter;

/**
 * Created by tianhe on 2019/9/4.
 * 公众号天河聊架构
 */
@Getter
@Setter
public class SeviceDetail {

    private String host;

    private String port;

    private String serviceId;

    private String restPath;
}
