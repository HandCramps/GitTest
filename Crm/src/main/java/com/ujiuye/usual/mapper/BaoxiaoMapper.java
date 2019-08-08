package com.ujiuye.usual.mapper;


import com.ujiuye.usual.bean.Baoxiao;

public interface BaoxiaoMapper {
    int deleteByPrimaryKey(String bxid);

    int insert(Baoxiao record);

    int insertSelective(Baoxiao record);

    Baoxiao selectByPrimaryKey(String bxid);

    int updateByPrimaryKeySelective(Baoxiao record);

    int updateByPrimaryKey(Baoxiao record);
}