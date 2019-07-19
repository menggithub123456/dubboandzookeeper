package com.dubbo.service;



import com.dubbo.provider.entity.District;

import java.util.List;

public interface DistrictService {
    public List<District> getAllDistrict();
    public int addDistrict(District district);
    public int delDistrict(Integer id);
}
