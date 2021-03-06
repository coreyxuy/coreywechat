package com.itcorey.coreywechat.controller;

import com.alibaba.fastjson.JSON;
import com.itcorey.coreywechat.baseResult.CommonResult;
import com.itcorey.coreywechat.controller.req.HelloReq;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @author corey
 * @Description
 * @create 2019-11-27 15:39
 */
@Api(value = "helloSwagger测试")
@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(value = "swagger测试接口", notes = "首页测试接口")
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public CommonResult<String> hello(@RequestBody @Valid HelloReq req){
        logger.info("请求参数 {}",req);
        Map<String,Object> mapUser = new HashMap<>();
        mapUser.put("name","张三");
        mapUser.put("age","18");
        mapUser.put("sex","19");
        return CommonResult.success(JSON.toJSONString(mapUser));
    }
}
