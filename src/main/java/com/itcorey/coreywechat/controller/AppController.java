package com.itcorey.coreywechat.controller;

import com.itcorey.coreywechat.annotation.Todo;
import com.itcorey.coreywechat.baseResult.CommonResult;
import com.itcorey.coreywechat.baseResult.ResultCode;
import com.itcorey.coreywechat.enumtype.TodoType;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author corey
 * @Description
 * @create 2019-12-30 11:33
 */
@Api(description = "App接口API")
@RestController
@RequestMapping("/app")
public class AppController {

    @ApiOperation(value = "获取App接口测试信息",notes = "获取App接口测试信息")
    @ApiImplicitParam(name = "keyword",value = "关键字",required = false,dataType = "String",paramType = "query")
    @GetMapping("/get")
    public CommonResult<Object> getApp(String keyword) {
        return CommonResult.success(ResultCode.SUCCESS,"返回获取App接口测试信息");
    }

    @ApiOperation(value = "保存App接口测试信息",notes = "保存App接口测试信息")
    @ApiImplicitParam(name = "params",value = "json参数",required = false,paramType = "body")
    @PostMapping("/save")
    public  CommonResult<Object> save(@RequestBody Map<String,Object> params) {
        return CommonResult.success(ResultCode.SUCCESS,"返回测试保存App接口测试信息");
    }

    @ApiOperation(value = "支付方式是支付宝",notes = "支付方式是支付宝")
    @ApiImplicitParam(name = "payType",value = "关键字",required = false,dataType = "String",paramType = "query")
    @GetMapping("/alipay")
    @Todo(TodoType.WECHAT)
    public CommonResult<Object> alipay(String payType) {
        return CommonResult.success(ResultCode.SUCCESS,"返回支付宝支付信息");
    }

    @ApiOperation(value = "支付方式是微信",notes = "支付方式是微信")
    @ApiImplicitParam(name = "payType",value = "关键字",required = false,dataType = "String",paramType = "query")
    @GetMapping("/weChat")
    @Todo(TodoType.WECHAT)
    public CommonResult<Object> weChat(String payType) {
        return CommonResult.success(ResultCode.SUCCESS,"返回微信支付信息");
    }
}
