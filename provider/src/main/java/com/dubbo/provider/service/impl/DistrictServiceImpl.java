package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;


import com.dubbo.provider.entity.District;
import com.dubbo.provider.entity.DistrictExample;
import com.dubbo.provider.mapper.DistrictMapper;
import com.dubbo.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service(interfaceClass = DistrictService.class)//暴露接口
@Component  //创建对象
public class DistrictServiceImpl implements DistrictService {

    @Autowired
    private DistrictMapper districtMapper;
    @Override
    public List<District> getAllDistrict() {
        return districtMapper.selectByExample(null);
    }
}
