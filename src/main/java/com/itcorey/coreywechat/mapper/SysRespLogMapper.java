package com.itcorey.coreywechat.mapper;

import com.itcorey.coreywechat.entity.SysRespLog;

public interface SysRespLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRespLog record);

    int insertSelective(SysRespLog record);

    SysRespLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRespLog record);

    int updateByPrimaryKey(SysRespLog record);
}