package com.ujiuye.pro.mapper;


import com.ujiuye.pro.bean.Project;

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
}