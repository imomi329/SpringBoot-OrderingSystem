package com.finsage.web.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finsage.web.demo.bean.Demo;
import com.finsage.web.demo.mapper.DemoMapper;

@Service
public class DemoService {

	@Autowired
	private DemoMapper demoMapper;

	public List<Demo> likeName(String name) {
		return demoMapper.likeName(name);
	}

	public Demo getById(long id) {
		return demoMapper.getById(id);
	}

	public String getNameById(long id) {
		return demoMapper.getNameById(id);
	}
	
	@Transactional // 添加事務
	public void save(Demo demo) {
		demoMapper.save(demo);
	}
	
}
