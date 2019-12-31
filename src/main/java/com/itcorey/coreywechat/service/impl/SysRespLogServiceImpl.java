package com.itcorey.coreywechat.service.impl;

import com.itcorey.coreywechat.entity.SysRespLog;
import com.itcorey.coreywechat.entity.WebLog;
import com.itcorey.coreywechat.mapper.SysRespLogMapper;
import com.itcorey.coreywechat.service.SysRespLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author corey
 * @Description
 * @create 2019-12-30 16:03
 */
@Slf4j
@Service
public class SysRespLogServiceImpl implements SysRespLogService {

    @Autowired
    private SysRespLogMapper sysRespLogMapper;

    @Override
    public Integer insterLogInfo(WebLog webLog) {
        SysRespLog syslog = new SysRespLog();
        syslog.setId(1);
        syslog.setDescription("142254");
        syslog.setUsername("142254");
        syslog.setBasePath("142254");
        syslog.setReqInfo("142254");
        syslog.setMethod("142254");
        syslog.setParameter("12548787");
        syslog.setIp("142254");
        syslog.setUri("147258");
        syslog.setUrl("142254");
        syslog.setSpendtime("142254");
        syslog.setResult("142254");
        sysRespLogMapper.insertSelective(syslog);
        return null;
    }
}
