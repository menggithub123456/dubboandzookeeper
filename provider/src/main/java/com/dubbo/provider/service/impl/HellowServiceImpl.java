package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.HellowService;
import org.springframework.stereotype.Component;

@Service(version = "1.0",interfaceClass = HellowService.class,timeout = 1000)
@Component     //创建对象
public class HellowServiceImpl implements HellowService {
    @Override
    public String getHellow() {
        return "hellowoxdfbg";
    }
}
