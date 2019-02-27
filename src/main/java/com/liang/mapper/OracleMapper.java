package com.liang.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author lianghaiyang
 * @date 2019/02/21
 */
@Mapper
public interface OracleMapper {
    /**
     * 传入sql查询
     * @param sql sql语句
     * @return 查询结果
     */
    List<Map> ecocityMessage(String sql);
}
