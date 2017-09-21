package com.finsage.web.login.service;

import com.finsage.web.login.mapper.LoginMapper;
import com.finsage.web.login.mapper.UserModelMapper;
import com.finsage.web.login.model.UserBean;
import com.finsage.web.login.model.UserModelBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by knigh on 2017/9/21.
 */
public class LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private UserModelMapper userModelMapper;

    private UserModelBean userModelBean;

    public UserModelBean getLoginInfo(UserBean userBean){
        String userId = loginMapper.selectUserByAccount(userBean);
        if( userId != null || userId.equals("")){
            return getUserModel(userId);
        } else {
            return null;
        }
    }

    private UserModelBean getUserModel(String userId){
        userModelBean = userModelMapper.selectUserModel(userId);
        return userModelBean == null? null: userModelBean;
    }
}
