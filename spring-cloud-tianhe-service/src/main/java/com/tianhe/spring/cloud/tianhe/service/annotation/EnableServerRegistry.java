package com.tianhe.spring.cloud.tianhe.service.annotation;

/**
 * Created by tianhe on 2019/9/4.
 * 公众号天河聊架构
 */
public @interface EnableServerRegistry {

    String value() default "";
}
