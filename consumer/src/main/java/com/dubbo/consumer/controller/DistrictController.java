package com.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;

import com.dubbo.provider.entity.District;
import com.dubbo.service.DistrictService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DistrictController {
    @Reference(interfaceClass = DistrictService.class)
    private DistrictService districtService;

    @RequestMapping("getAllDistrict")
    @ResponseBody
    public List<District> getAllDistrict(){
        List<District> list=districtService.getAllDistrict();
        return list;
    }
    @RequestMapping("getDistrict")
    public String getDistrict(Model model){
        List<District> list=districtService.getAllDistrict();
        model.addAttribute("list",list);
        return "index";
    }
}
