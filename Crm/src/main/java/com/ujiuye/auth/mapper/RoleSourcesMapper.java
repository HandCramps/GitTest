package com.ujiuye.auth.mapper;

import com.ujiuye.auth.bean.RoleSources;


public interface RoleSourcesMapper {
    int deleteByPrimaryKey(Integer rsid);

    int insert(RoleSources record);

    int insertSelective(RoleSources record);

    RoleSources selectByPrimaryKey(Integer rsid);

    int updateByPrimaryKeySelective(RoleSources record);

    int updateByPrimaryKey(RoleSources record);
}