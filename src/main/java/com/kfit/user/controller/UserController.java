package com.kfit.user.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kfit.user.bean.User;
import com.kfit.user.service.UserService;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.15
 */
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/save")
	public User save(User user) {
		System.out.println("===================");
		Integer rs = userService.save(user);
		System.out.println("rs--> " + rs);
		return user;
	}

	@GetMapping("/update")
	public int update(User user) {
		return userService.update(user);
	}
	
	@GetMapping("/update2")
	public int update2(User user) {
		return userService.update2(user);
	}

	@GetMapping("/delete")
	public int delete(int id) {
		return userService.delete(id);
	}

	@GetMapping("/selectAll")
	public List<User> selectAll(int pageNum, int pageSize) {
//		if (pageNum != 0 && pageSize != 0) {
//			PageHelper.startPage(pageNum, pageSize);
//		}
		return userService.selectAll();
	}

	@GetMapping("/selectById")
	public List<User> selectById(int id) {
		return userService.selectById(id);
	}
	
//	@GetMapping("/selectById2")
//	public List<User> selectById2(int id) {
//		return userService.selectById2(id);
//	}

	@GetMapping("/select1")
	public List<User> select1(String name, String email) {
		return userService.select1(name, email);
	}

	@GetMapping("/selectByName")
	public List<User> selectByName(String name) {
		return userService.selectByName(name);
	}

	@GetMapping("/selectByName2")
	public List<User> selectByName2(String name) {
		return userService.selectByName2(name);
	}
	
	@GetMapping("/select6")
	public List<User> select6(User user) {
		return userService.select6(user);
	}
	
	@GetMapping("/select7")
	public List<User> select7(User user) {
		return userService.select7(user);
	}
	
	@GetMapping("/select8")
	public List<User> select8(Integer[] id) {
		return userService.select8(Arrays.asList(id));
	}

}
