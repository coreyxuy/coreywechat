package com.itcorey.coreywechat.service;

import com.itcorey.coreywechat.entity.WebLog;

/**
 * @author corey
 * @Description
 * @create 2019-12-30 16:03
 */
public interface SysRespLogService {


    /**
     * 日志操作记录
     * @param webLog
     * @return
     */
    Integer insterLogInfo(WebLog webLog);
}
