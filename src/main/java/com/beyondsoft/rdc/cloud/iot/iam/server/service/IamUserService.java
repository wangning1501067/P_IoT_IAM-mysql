package com.beyondsoft.rdc.cloud.iot.iam.server.service;

import com.beyondsoft.rdc.cloud.iot.iam.server.model.IamUserDo;
import com.beyondsoft.rdc.cloud.iot.iam.server.model.IamUserVo;

public interface IamUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(IamUserDo record);

    int insertSelective(IamUserDo record);

    IamUserVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IamUserDo record);

    int updateByPrimaryKey(IamUserDo record);

    IamUserVo getOneUser(String username, String password);
}