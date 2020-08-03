package com.beyondsoft.rdc.cloud.iot.iam.client.user.service.impl;

import com.beyondsoft.rdc.cloud.iot.iam.client.user.service.ClientIamUserService;
import com.beyondsoft.rdc.cloud.iot.iam.server.model.IamUserVo;
import com.beyondsoft.rdc.cloud.iot.iam.server.model.LoginModel;
import com.beyondsoft.rdc.cloud.iot.iam.server.model.ServerPath;
import com.beyondsoft.rdc.cloud.iot.iam.server.mapper.IamUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienntIamUserServiceImpl implements ClientIamUserService {

    @Autowired
    private IamUserMapper userMapper;

    @Override
    public IamUserVo getOneUser(LoginModel loginModel) {
        IamUserVo user = this.userMapper.getOneUser(loginModel.getUsername());
//        if(user==null){
//            throw new GeneralException(InternationEnum.KEY_USERNAME_ERROR.getLanguage(GlobalValue.getLanguage()));
//        }else{
//            String passMd5 = MD5Util.MD5(loginModel.getPassword());
//            if(!user.getPassword().equals(passMd5)){
//                throw new GeneralException(InternationEnum.KEY_PASSWORD_ERROR.getLanguage(GlobalValue.getLanguage()));
//            }
//            /*if (!BCrypt.checkpw(password, user.getPassword())) {
//                throw new GeneralException(InternationEnum.KEY_PASSWORD_ERROR.getLanguage(GlobalValue.getLanguage()));
//            }*/
//        }
        user.setIp(ServerPath.ip);
        user.setIp(ServerPath.port);
        return user;
    }
}