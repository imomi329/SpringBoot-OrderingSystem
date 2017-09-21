package com.finsage.web.login.mapper;

import com.finsage.web.login.model.UserBean;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.20
 */
public interface LoginMapper {
	
	public String selectUserByAccount(UserBean userBean);

}
