package com.finsage.web.login.controller;

import com.finsage.web.base.BaseModel;
import com.finsage.web.base.Message;
import com.finsage.web.login.model.UserBean;
import com.finsage.web.login.model.UserModelBean;
import com.finsage.web.login.service.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.20
 */
@RestController
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/check")
	public BaseModel login(UserBean ub) {
		BaseModel bm = new BaseModel();
		LoginService loginService = new LoginService();
		UserModelBean userModelBean = loginService.getLoginInfo(ub);
		if(userModelBean == null){
			bm.setSuccess(false);
			bm.setReturnCode(Message.returnCode1000);
			bm.setReturnMessage(Message.returnMessage1000);
			return bm;
		} else{
			bm.setData(userModelBean);
			bm.setSuccess(true);
			bm.setReturnCode(Message.returnCode0000);
			bm.setReturnMessage(Message.returnMessage0000);
			return bm;
		}
	}
}
