package com.finsage.web.user.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finsage.util.XMLUtil.StringUtil;
import com.finsage.web.base.BaseModel;
import com.finsage.web.user.mapper.UserMapper;
import com.finsage.web.user.model.User;
import com.finsage.web.user.model.UserInfo;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.22
 */
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/*
	 * 註冊 0.
	 */
	public BaseModel signOn(UserInfo userInfo) {
		BaseModel bm = new BaseModel();
		if (StringUtil.isBlank(userInfo.getUserRoleId())) {
			bm.setReturnCode("1");
			bm.setReturnMessage("職稱欄位，必填");
			bm.setSuccess(false);
			return bm;
		}

		try {
			// 自動建立，員工編號
			int roleType = userMapper.selectRoleTypeByRoleId(userInfo.getUserRoleId());
			User newUser = createUser(roleType);
			// 輸入員工資訊
			userInfo.setUserId(newUser.getUserId());
			int rs = userMapper.saveUserInfo(userInfo);
			if (rs > 0) {
				System.out.println("帳號： " + newUser.getAccount() + " 新建成功");
			}

			bm.setData(newUser);
			bm.setSuccess(true);
			bm.setReturnCode("0");
			bm.setReturnMessage("帳號新建成功");
		} catch (Exception e) {
			bm.setReturnCode("1");
			LoggerFactory.getLogger(this.getClass()).error("{}", e);
			bm.setReturnMessage("提取資料失敗 : " + e.toString());
			bm.setSuccess(false);
		}
		return bm;
	}

	/*
	 * 註冊 1.自動新建帳號
	 */
	private User createUser(int roleType) {
		User user = new User();
		// 亂數建立 USER_ID
		user.setUserId(UUID.randomUUID().toString().replace("-", ""));
		// 員工編號：西元年 + 內外場 + 流水號
		String newAccount = newAccount(roleType);
		user.setAccount(newAccount);
		user.setPassword("123456");

		int rs = userMapper.saveUser(user);
//		System.out.println("rs--> " + rs); // rs 對DB新增的資料數量
		User newUser = new User();
		if (rs > 0) {
			newUser = userMapper.selectByAccount(user);
		}
		return newUser;
	}

	/*
	 * 註冊 2.員工編號：西元年 + 內外場 + 流水號
	 */
	private String newAccount(int typeCode) {
		String lastAccount = userMapper.selectLastAccount();
		System.out.println(Integer.valueOf(lastAccount.substring(5, 8)));
		String year = String.valueOf(new SimpleDateFormat("yyyy").format(new Date()));
		String newNo = String.valueOf(typeCode * 1000 + (Integer.valueOf(lastAccount.substring(5, 8)) + 1));
		return year + newNo;
	}

	/*
	 * 登錄 0.
	 */
	public BaseModel login(User user) {
		BaseModel bm = new BaseModel();
		if (StringUtil.isBlank(user.getAccount())) {
			bm.setReturnCode("1");
			bm.setReturnMessage("帳號欄位，必填");
			bm.setSuccess(false);
			return bm;
		}
		if (StringUtil.isBlank(user.getPassword())) {
			bm.setReturnCode("1");
			bm.setReturnMessage("密碼欄位，必填");
			bm.setSuccess(false);
			return bm;
		}
		
		try {
			user.setStatus("1");
			User realUser = userMapper.selectByAccount(user);
			if (!realUser.getPassword().equals(user.getPassword())) {
				bm.setReturnCode("1");
				bm.setReturnMessage("密碼錯誤，請重新輸入");
				bm.setSuccess(false);
				return bm;
			}
			UserInfo userInfo = userMapper.selectUserInfoByUserId(realUser.getUserId());
			userInfo.setAccount(user.getAccount());
			
			bm.setData(userInfo);
			bm.setReturnCode("0");
			bm.setReturnMessage("登錄成功");
			bm.setSuccess(true);
		} catch (Exception e) {
			bm.setReturnCode("1");
			LoggerFactory.getLogger(this.getClass()).error("{}", e);
			bm.setReturnMessage("提取資料失敗 : " + e.toString());
			bm.setSuccess(false);
		}
		return bm;
	}
	
	/*
	 * 忘記密碼
	 */
	public BaseModel findPassword(String idCard) {
		BaseModel bm = new BaseModel();
		if (StringUtil.isBlank(idCard)) {
			bm.setReturnCode("1");
			bm.setReturnMessage("身分證欄位，必填");
			bm.setSuccess(false);
			return bm;
		}
		
		try {
			userMapper.updateUserPasswordByIdCard(idCard);
			
			bm.setData("密碼已修正，請儘速修改新密碼");
			bm.setReturnCode("0");
			bm.setReturnMessage("忘記密碼");
			bm.setSuccess(true);
		} catch (Exception e) {
			bm.setReturnCode("1");
			LoggerFactory.getLogger(this.getClass()).error("{}", e);
			bm.setReturnMessage("提取資料失敗 : " + e.toString());
			bm.setSuccess(false);
		}
		
		
		return bm;
	}
}
