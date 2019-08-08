package com.ujiuye.usual.mapper;


import com.ujiuye.usual.bean.Forumpost;

public interface ForumpostMapper {
    int deleteByPrimaryKey(Integer forumid);

    int insert(Forumpost record);

    int insertSelective(Forumpost record);

    Forumpost selectByPrimaryKey(Integer forumid);

    int updateByPrimaryKeySelective(Forumpost record);

    int updateByPrimaryKey(Forumpost record);
}