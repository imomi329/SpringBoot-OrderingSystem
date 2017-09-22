package com.finsage.web.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finsage.web.base.BaseModel;
import com.finsage.web.user.model.User;
import com.finsage.web.user.model.UserInfo;
import com.finsage.web.user.service.UserService;

/**
 * 使用者相關
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.22
 */
@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserService userService;
	
	/*
	 * 註冊
	 */
	@GetMapping("/SignOn")
	public BaseModel signOn(UserInfo userInfo) {
		return userService.signOn(userInfo);
	}
	
	/*
	 * 登錄
	 */
	@GetMapping("/Login")
	public BaseModel Login(User user) {
		return userService.login(user);
	}
	
	/*
	 * 忘記密碼
	 */
	@GetMapping("/FindPassword")
	public BaseModel findPassword(User user) {
		return userService.findPassword(user);
	}

}
