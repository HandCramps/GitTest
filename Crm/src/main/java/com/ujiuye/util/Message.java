package com.ujiuye.util;

import lombok.Data;

import java.io.Serializable;

@Data
public class Message implements Serializable {
    private Integer code;
    private String msgInfo;
    private String msgDetail;
}
