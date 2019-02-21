package com.liang.service;

import com.liang.mapper.EcocityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lianghaiyang
 * @date 2019/02/20
 */
@Service
public class EcocityService {
    @Resource
    private EcocityMapper ecocityMapper;

    public Object ecocityMessage(String sql){
       return ecocityMapper.ecocityMessage(sql);
    }
}
