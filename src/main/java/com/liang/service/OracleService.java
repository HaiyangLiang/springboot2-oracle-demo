package com.liang.service;

import com.liang.mapper.OracleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author lianghaiyang
 * @date 2019/02/20
 */
@Service
public class OracleService {
    @Resource
    private OracleMapper oracleMapper;

    public Object ecocityMessage(String sql){
       return oracleMapper.ecocityMessage(sql);
    }
}
