package com.beyondsoft.rdc.cloud.iot.iam.server.mapper;

import com.beyondsoft.rdc.cloud.iot.iam.server.model.IamUserDo;
import com.beyondsoft.rdc.cloud.iot.iam.server.model.IamUserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IamUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IamUserDo record);

    int insertSelective(IamUserDo record);

    IamUserVo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IamUserDo record);

    int updateByPrimaryKey(IamUserDo record);

    IamUserVo getOneUser(@Param("username") String username);
}