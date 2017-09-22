package com.finsage.web.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finsage.web.base.BaseModel;
import com.finsage.web.user.model.User;
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
	public BaseModel signOn(User user) {
		return userService.signOn(user);
	}

//	@GetMapping("/save")
//	public User save(User user) {
//		System.out.println("===================");
//		Integer rs = userService.save(user);
//		System.out.println("rs--> " + rs);
//		return user;
//	}

}
