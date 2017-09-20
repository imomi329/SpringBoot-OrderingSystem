package com.finsage.web.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finsage.web.demo.bean.Demo;
import com.finsage.web.demo.service.DemoService;
import com.github.pagehelper.PageHelper;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping("/likeName")
	public List<Demo> likeName(String name) {
		/*
		 * 參數一：頁數
		 * 參數二：每頁筆數
		 */
		PageHelper.startPage(1,2);
		return demoService.likeName(name);
	}

	@RequestMapping("/getById")
	public Demo getById(long id) {
		return demoService.getById(id);
	}

	@RequestMapping("/getNameById")
	public String getNameById(long id) {
		return demoService.getNameById(id);
	}
	
	@RequestMapping("/save")
	public void save(String name) {
		Demo demo = new Demo();
		demo.setName(name);
		demoService.save(demo);
	}

}
