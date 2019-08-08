package com.ujiuye.emp.mapper;

import com.ujiuye.emp.bean.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {

    int deleteByPrimaryKey(Integer eid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

  

}