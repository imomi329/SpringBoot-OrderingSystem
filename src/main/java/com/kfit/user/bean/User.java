package com.kfit.user.bean;

import java.util.Date;

import com.kfit.user.enums.SexEnum;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.15
 */
public class User {

	private int id; // 主鍵
	private String name; // 姓名
	private String email; // 信箱
	private Date updateTime; // 修改時間
	private SexEnum sexEnum; // 性別

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public SexEnum getSexEnum() {
		return sexEnum;
	}

	public void setSexEnum(SexEnum sexEnum) {
		this.sexEnum = sexEnum;
	}

}
