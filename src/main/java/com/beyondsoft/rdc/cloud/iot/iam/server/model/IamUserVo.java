package com.beyondsoft.rdc.cloud.iot.iam.server.model;

import lombok.Data;

import java.util.Date;

@Data
public class IamUserVo {
    private Integer id;

    private String username;

    private String password;

    private Integer merchantId;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    //服务端ip
    private String ip;

    //服务端端口
    private String port;
}