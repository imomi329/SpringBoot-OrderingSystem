package com.finsage.web.login.mapper;

import com.finsage.web.login.model.UserModelBean;

/**
 * Created by knigh on 2017/9/21.
 */
public interface UserModelMapper {

    public UserModelBean selectUserModel(String userId);
}
