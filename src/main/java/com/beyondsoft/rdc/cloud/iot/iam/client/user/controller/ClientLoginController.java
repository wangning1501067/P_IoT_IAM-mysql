package com.beyondsoft.rdc.cloud.iot.iam.client.user.controller;

import com.beyondsoft.rdc.cloud.iot.iam.client.user.service.ClientIamUserService;
import com.beyondsoft.rdc.cloud.iot.iam.common.constant.SessionConstant;
import com.beyondsoft.rdc.cloud.iot.iam.common.response.ObjectRestResponse;
import com.beyondsoft.rdc.cloud.iot.iam.server.model.IamUserVo;
import com.beyondsoft.rdc.cloud.iot.iam.server.model.LoginModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/client/no-login")
public class ClientLoginController {

    @Autowired
    private ClientIamUserService userService;

    /**
     * 用户登录
     */
    @PostMapping("/login")
    public ObjectRestResponse adminLogin(@RequestBody LoginModel loginModel, HttpSession session) {
        ObjectRestResponse<Object> restResponse = new ObjectRestResponse<>();
        IamUserVo user = this.userService.getOneUser(loginModel);
        if (user == null) {
            session.setAttribute(SessionConstant.NAME, user);
        }
        restResponse.setData(user);
        return restResponse;
    }
}
