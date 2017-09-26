package com.finsage.web.user.model;

import java.util.Date;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.22
 */
public class UserInfo extends User {

	private Integer id; // 主鍵
	// private String userId; // 使用者ID
	private Integer userRoleId; // 職稱代號
	private String roleName; // 職稱(USER_ROLE.ROLE_NAME)
	private String name; // 姓名
	private Date birthday; // 生日
	private String idCard; // 身分證
	private String phone; // 電話
	private String address; // 地址
	private String status; // 狀態
	private Date createDate; // 建立時間
	private Date updateDate; // 修改時間

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	@Override
	public String toString(){
		return getAccount();
	}

}
