package com.study.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * EurekaFeignService
 * 服务消费者，调用服务提供者提供的服务，实现业务
 *
 * @author mayunzhen
 * @version 1.0.0
 */
@FeignClient(value = "eureka-client") // 调用的服务的名称
public interface EurekaFeignService {

    @RequestMapping(value = "/info")
    String getInfo();

}
