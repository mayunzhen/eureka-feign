package com.study.eurekafeign.service;

import org.springframework.stereotype.Service;

/**
 * EurekaFeignServiceFailure
 * 服务消费者，调用服务提供者提供的服务失败，回调处理类
 *
 * @author mayunzhen
 * @version 1.0.0
 */
@Service
public class EurekaFeignServiceFailure implements EurekaFeignService {

    @Override
    public String getInfo() {
        String message = "网络繁忙，请稍后再试-_-。PS：服务消费者自己提供的信息mmm";
        return message;
    }

}