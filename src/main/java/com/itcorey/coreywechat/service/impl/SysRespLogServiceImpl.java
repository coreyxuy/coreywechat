package com.itcorey.coreywechat.service.impl;

import cn.hutool.core.date.DateUtil;
import com.itcorey.coreywechat.entity.SysRespLog;
import com.itcorey.coreywechat.entity.WebLog;
import com.itcorey.coreywechat.mapper.SysRespLogMapper;
import com.itcorey.coreywechat.service.SysRespLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author corey
 * @Description
 * @create 2019-12-30 16:03
 */
@Slf4j
@Service("sysRespLogService")
public class SysRespLogServiceImpl implements SysRespLogService {

    @Resource
    private SysRespLogMapper sysRespLogMapper;

    @Override
    public Integer insterLogInfo(WebLog webLog) {
        SysRespLog syslog = new SysRespLog();
        syslog.setDescription(webLog.getDescription());
        syslog.setUsername(webLog.getUsername());
        syslog.setBasePath(webLog.getBasePath());
        syslog.setReqInfo(String.valueOf(webLog.getParameter()));
        syslog.setMethod(webLog.getMethod());
        syslog.setIp(webLog.getIp());
        syslog.setStarttime(DateUtil.parse(String.valueOf(webLog.getStartTime())));
        syslog.setUri(webLog.getUri());
        syslog.setUrl(webLog.getUrl());
        syslog.setSpendtime(String.valueOf(webLog.getSpendTime()));
        syslog.setResult(String.valueOf(webLog.getResult()));
        sysRespLogMapper.insertSelective(syslog);
        return null;
    }
}
