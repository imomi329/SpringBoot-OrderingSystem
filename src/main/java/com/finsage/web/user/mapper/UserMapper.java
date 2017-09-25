package com.finsage.web.user.mapper;

import com.finsage.web.user.model.User;
import com.finsage.web.user.model.UserInfo;

/**
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.22
 */
public interface UserMapper {

	public int selectRoleTypeByRoleId(int roleId);

	public int saveUser(User user);

	public String selectLastAccount();

	public User selectByAccount(User user);

	public int saveUserInfo(UserInfo userInfo);

	public UserInfo selectUserInfoByUserId(String userId);

	public int updateUserPasswordByIdCard(String idCard);

	// /**
	// *
	// * @param user
	// * @return
	// */
	//// @Select("insert into user(name) values (#{name})")
	//// @Options(keyProperty="id",keyColumn="id",useGeneratedKeys=true)
	// public Integer save(User user);
	//
	//// @Update("update user set name = #{name} where id = #{id}")
	// public int update(User user);
	//
	// public int update2(User user);
	//
	// /**
	// * 刪除
	// * @param id
	// * @return
	// */
	//// @Delete("delete from user where id = #{id}")
	// public int delete(int id);
	//
	//// @Select("select * from user")
	// public List<User> selectAll();
	//
	//// @Select("select * from user where id = #{id}")
	// public List<User> selectById(int id);
	//
	//// @Select("select * from user where id = #{id}")
	//// @Results({
	//// @Result(property="updateTime", column="update_time"),
	//// @Result(property="sexEnum", column="SEX_ENUM", javaType=SexEnum.class)
	//// })
	//// public List<User> selectById2(int id);
	//
	// /**
	// * 多筆參數，未加 @Param 時，若該參數為 null 會報錯
	// * @param id
	// * @param name
	// * @return
	// */
	//// @Select("select * from user where name = #{name} and email = #{email}")
	// public List<User> select1(@Param("name")String name,
	// @Param("email")String email);
	//
	// /**
	// * #{} 和 ${} 的區別 ?!
	// */
	//// @Select("select * from user where name = #{name}")
	// public List<User> selectByName(String name);
	//
	//// @Select("select * from user where name = '${name}'")
	// public List<User> selectByName2(@Param("name")String name);
	//
	// // 練習1.查詢USER表 id = X 的紀錄
	//// @Select("select * from user where id = #{id}")
	// public User select3(int id);
	//
	// // 練習2. 查詢USER表的數據，並且依照指定字段id 或 name降序排列
	// // select * from user order by id/name{參數輸入}
	//// @Select("swelect * from uder order by ${orderField}")
	// public User select4(String orderField);
	//
	// // 練習3. 查詢USER表的數據，並且依照指定字段id 或 name升序或者降序排列
	// // select * from user order by id/name{參數輸入}
	//// @Select("swelect * from uder order by ${orderField} ${ascOrDesc}")
	// public User select5(@Param("orderField")String orderField,
	// @Param("ascOrDesc")String ascOrDesc);
	//
	//// @Select("<script>select * from user where "
	//// + "1=1"
	//// + "<if test='name != null'>and name = #{name} </if>"
	//// + "<if test='email != null'>and email = #{email} </if>"
	//// + "</script>")
	// public List<User> select6(User user);
	//
	// public List<User> select7(User user);
	//
	// public List<User> select8(List<Integer> list);
	//
	//// @Select("select id from member_role where level = 0")
	// public String selectRole();
	//

}
