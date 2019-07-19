package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;


import com.dubbo.service.HellowService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Reference(interfaceClass =HellowService.class,version = "1.0",check = false)
    private HellowService hellowService;

    @RequestMapping("getHello")
    @ResponseBody
    public String getHellw(){
        return hellowService.getHellow();
    }
}
