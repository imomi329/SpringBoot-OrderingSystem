package com.finsage.web.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finsage.web.login.mapper.LoginMapper;
import com.finsage.web.login.model.UserBean;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.20
 */
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginMapper loginMapper;

	@RequestMapping("/check")
	public String login(UserBean ub) {

		if (ub.getAccount() == null || ub.getAccount().equals("")) {
			return "請輸入帳號";
		}
		if (ub.getPassword() == null || ub.getPassword().equals("")) {
			return "請輸入密碼";
		}

		try {
			String account = ub.getAccount();
			System.out.println(account);
			UserBean loginBean = loginMapper.selectByAccount(account);
//			System.err.println(loginBean.getAccount());
			if (loginBean == null) {
				return "查無使用者";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "歡迎回來";
	}
}
