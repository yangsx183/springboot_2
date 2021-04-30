package com.yangsx.gpdb.service;

import com.yangsx.gpdb.mapper.GpdbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GpdbService {
    @Autowired
    GpdbMapper gpdbMapper;
    public List<Map<String,Object>> regionList(Map<String,Object> from){
        return gpdbMapper.regionList(from);
    }
}
