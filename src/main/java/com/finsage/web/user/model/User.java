package com.finsage.web.user.model;

import java.util.Date;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.22
 */
public class User {

	private int id; // 主鍵
	private String userId; // USER_ID
	private String account; // 帳號
	private String password; // 密碼
	private String status; // 狀態
	private Date createDate; // 建立時間
	private Date updateDate; // 修改時間
	// private SexEnum sexEnum; // 性別

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
