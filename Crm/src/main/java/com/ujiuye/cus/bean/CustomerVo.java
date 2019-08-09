package com.ujiuye.cus.bean;

import lombok.Data;

/*
*
*   vo 业务模型，和表单中的控件进行对应的
*   bean数据模型  和数据库中的表对应的
*
* */
@Data
public class CustomerVo extends Customer {

    private Integer kinds;//查询类型

    private String keyCode="";//查询的关键字

    private Integer mark;//是否排序的标记
}
