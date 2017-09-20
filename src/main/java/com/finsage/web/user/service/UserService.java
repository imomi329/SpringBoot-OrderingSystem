package com.finsage.web.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finsage.web.user.bean.User;
import com.finsage.web.user.mapper.UserMapper;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.15
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Transactional
	public Integer save(User user) {
		return userMapper.save(user);
	}
	
	@Transactional
	public int update(User user) {
		return userMapper.update(user);
	}
	
	@Transactional
	public int update2(User user) {
		return userMapper.update2(user);
	}
	
	@Transactional
	public int delete(int id) {
		return userMapper.delete(id);
	}
	
	public List<User> selectAll() {
		return userMapper.selectAll();
	}
	
	public List<User> selectById(int id) {
		return userMapper.selectById(id);
	}
	
//	public List<User> selectById2(int id) {
//		return userMapper.selectById2(id);
//	}
	
	public List<User> select1(String name, String email) {
		System.out.println(name + "&&&&&" + email);
		return userMapper.select1(name, email);
	}
	
	public List<User> selectByName(String name) {
		return userMapper.selectByName(name);
	}
	
	public List<User> selectByName2(String name) {
		return userMapper.selectByName2(name);
	}
	
	public List<User> select6(User user) {
		return userMapper.select6(user);
	}
	
	public List<User> select7(User user) {
		return userMapper.select7(user);
	}
	
	public List<User> select8(List<Integer> list) {
		return userMapper.select8(list);
	}
	
	public String selectRole() {
		return userMapper.selectRole();
	}
	
}
