package com.itcorey.coreywechat.service.impl;

import com.itcorey.coreywechat.entity.SysRespLog;
import com.itcorey.coreywechat.entity.WebLog;
import com.itcorey.coreywechat.mapper.SysRespLogMapper;
import com.itcorey.coreywechat.service.SysRespLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author corey
 * @Description
 * @create 2019-12-30 16:03
 */
@Service
public class SysRespLogServiceImpl implements SysRespLogService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private SysRespLogMapper sysRespLogMapper;



    @Override
    public Integer insterLogInfo(WebLog webLog) {
        logger.info("插入请求参数 {}",webLog);
        SysRespLog sysRespLog = new SysRespLog();
        sysRespLog.setParameter("123");
        sysRespLog.setUrl("www.baidu.com");
        return sysRespLogMapper.insertSelective(sysRespLog);
    }
}
