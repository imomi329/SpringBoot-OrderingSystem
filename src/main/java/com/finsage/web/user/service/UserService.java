package com.finsage.web.user.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finsage.web.base.BaseModel;
import com.finsage.web.user.mapper.UserMapper;
import com.finsage.web.user.model.User;

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

	public BaseModel signOn(User user) {
		BaseModel bm = new BaseModel();
		// if (user.getAccount() == null || user.getAccount().equals("")) {
		// bm.setReturnCode("1");
		// bm.setReturnMessage("帳號欄位，請勿空白");
		// bm.setSuccess(false);
		// return bm;
		// }
		// if (user.getPassword() == null || user.getPassword().equals("")) {
		// bm.setReturnCode("1");
		// bm.setReturnMessage("密碼欄位，請勿空白");
		// bm.setSuccess(false);
		// return bm;
		// }

		try {
			// 亂數建立 USER_ID
			user.setUserId(UUID.randomUUID().toString().replace("-", ""));
			// 員工編號：西元年 + 內外場 + 流水號
			String type = "內場";
			int typeCode = 0;
			switch (type) {
			case "內場":
				typeCode = 1;
				break;
			case "外場":
				typeCode = 2;
				break;
			default:
				bm.setReturnCode("1");
				bm.setReturnMessage("部門類別，輸入有誤");
				bm.setSuccess(false);
				return bm;
			}
			String newAccount = newAccount(typeCode);
			user.setAccount(newAccount);
			user.setPassword("123456");
			
			int rs = userMapper.save(user);
			System.out.println("rs--> " + rs); // rs 對DB新增的資料數量
			User newUser = new User();
			newUser = userMapper.selectByAccount(newAccount);

			bm.setData(newUser);
			bm.setSuccess(true);
			bm.setReturnCode("0");
			bm.setReturnMessage("新增: " + rs + " 位使用者成功");
		} catch (Exception e) {
			bm.setReturnCode("1");
			LoggerFactory.getLogger(this.getClass()).error("{}", e);
			bm.setReturnMessage("提取資料失敗 : " + e.toString());
			bm.setSuccess(false);
		}
		return bm;
	}

	/*
	 * 員工編號：西元年 + 內外場 + 流水號
	 */
	private String newAccount(int typeCode) {
		String lastAccount = userMapper.selectLastAccount();
		System.out.println(Integer.valueOf(lastAccount.substring(5, 8)));
		String year = String.valueOf(new SimpleDateFormat("yyyy").format(new Date()));
		String newNo = String.valueOf(typeCode * 1000 + (Integer.valueOf(lastAccount.substring(5, 8)) + 1));
		return year + newNo;
	}

}
