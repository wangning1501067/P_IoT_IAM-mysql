package com.beyondsoft.rdc.cloud.iot.iam.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class IamUserDo {
    private Integer id;

    private String username;

    private String password;

    private Integer merchantId;

    private Integer status;

    private Date createTime;

    private Date updateTime;
}