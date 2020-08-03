package com.beyondsoft.rdc.cloud.iot.iam.server.service.impl;

import com.beyondsoft.rdc.cloud.iot.iam.common.exceptoin.GeneralException;
import com.beyondsoft.rdc.cloud.iot.iam.common.internation.GlobalValue;
import com.beyondsoft.rdc.cloud.iot.iam.common.internation.InternationEnum;
import com.beyondsoft.rdc.cloud.iot.iam.common.util.MD5Util;
import com.beyondsoft.rdc.cloud.iot.iam.server.model.IamUserDo;
import com.beyondsoft.rdc.cloud.iot.iam.server.model.IamUserVo;
import com.beyondsoft.rdc.cloud.iot.iam.server.mapper.IamUserMapper;
import com.beyondsoft.rdc.cloud.iot.iam.server.service.IamUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IamUserServiceImpl implements IamUserService {

    @Autowired
    private IamUserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IamUserDo record) {
        return this.userMapper.insert(record);
    }

    @Override
    public int insertSelective(IamUserDo record) {
        return this.userMapper.insertSelective(record);
    }

    @Override
    public IamUserVo selectByPrimaryKey(Integer id) {
        return this.userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IamUserDo record) {
        return this.userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IamUserDo record) {
        return this.userMapper.updateByPrimaryKey(record);
    }

    @Override
    public IamUserVo getOneUser(String username, String password) {
        IamUserVo user = this.userMapper.getOneUser(username);
        if(user==null){
            throw new GeneralException(InternationEnum.KEY_USERNAME_ERROR.getLanguage(GlobalValue.getLanguage()));
        }else{
            String passMd5 = MD5Util.MD5(password);
            if(!user.getPassword().equals(passMd5)){
                throw new GeneralException(InternationEnum.KEY_PASSWORD_ERROR.getLanguage(GlobalValue.getLanguage()));
            }
            /*if (!BCrypt.checkpw(password, user.getPassword())) {
                throw new GeneralException(InternationEnum.KEY_PASSWORD_ERROR.getLanguage(GlobalValue.getLanguage()));
            }*/
        }
        return user;
    }
}