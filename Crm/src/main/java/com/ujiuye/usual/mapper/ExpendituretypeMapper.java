package com.ujiuye.usual.mapper;


import com.ujiuye.usual.bean.Expendituretype;

public interface ExpendituretypeMapper {
    int deleteByPrimaryKey(Integer etid);

    int insert(Expendituretype record);

    int insertSelective(Expendituretype record);

    Expendituretype selectByPrimaryKey(Integer etid);

    int updateByPrimaryKeySelective(Expendituretype record);

    int updateByPrimaryKey(Expendituretype record);
}