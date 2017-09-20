package com.finsage.demo.mapper;

import java.util.List;

import com.finsage.demo.bean.Demo;

public interface DemoMapper {
	
//	@Select("select * from Demo where name=#{name}")
	public List<Demo> likeName(String name);
	
//	@Select("select * from Demo where id=#{id}")
	public Demo getById(long id);
	
//	@Select("select name from Demo where id=#{id}")
	public String getNameById(long id);
	
//	@Insert("insert into demo (name) values (#{name})")
//	@Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id") // 主鍵自增長
	public void save(Demo demo);

}
