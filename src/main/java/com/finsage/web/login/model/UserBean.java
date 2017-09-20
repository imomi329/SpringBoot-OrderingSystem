package com.finsage.web.login.model;

public class UserBean {
	private int id;
	private String userId;
	private String account;
	private String password;
	private String status;

	public UserBean() {
		super();
	}

	public UserBean(int id, String userId, String account, String password, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.account = account;
		this.password = password;
		this.status = status;
	}

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

}
