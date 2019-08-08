package com.ujiuye.duibiao.mapper;


import com.ujiuye.duibiao.bean.Datacollect;

public interface DatacollectMapper {
    int deleteByPrimaryKey(Integer daid);

    int insert(Datacollect record);

    int insertSelective(Datacollect record);

    Datacollect selectByPrimaryKey(Integer daid);

    int updateByPrimaryKeySelective(Datacollect record);

    int updateByPrimaryKey(Datacollect record);
}