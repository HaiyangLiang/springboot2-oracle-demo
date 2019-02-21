package com.liang.controller;

import com.liang.common.ResultModel;
import com.liang.service.EcocityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lianghaiyang
 * @date 2019/02/20
 */
@RestController
public class EcocityController {
    @Resource
    private EcocityService ecocityService;

    /**
     * @param sql     sql语句
     */
    @GetMapping("/message/{sql}")
    public ResultModel ecocityMessage(@PathVariable String sql) {
        Map<String, Object> body = new HashMap<>(1);
        Object result;
        try {
            result = ecocityService.ecocityMessage(sql);
        }catch (Exception e){
            body.put("msg",e.getLocalizedMessage());
            return ResultModel.failModel(body);
        }
        body.put("msg",result);
        return ResultModel.successModel(body);
    }
}
