package com.study.eurekafeign.controller;
import com.study.eurekafeign.service.EurekaFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * EurekaFeignController
 * 服务消费控制器类，对用户提供服务
 *
 * @author mayunzhen
 * @version 1.0.0
 */
@RestController
public class EurekaFeignController {

    @Resource
    private EurekaFeignService eurekaFeignService;

    @RequestMapping("/feignInfo")
    public String feignInfo() {
        String message = eurekaFeignService.getInfo();
        return "获取到的信息:" + message;
    }

}