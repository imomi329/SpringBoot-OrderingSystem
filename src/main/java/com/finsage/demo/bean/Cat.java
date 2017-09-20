package com.finsage.demo.bean;
//package com.kfit.demo.bean;
//
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//
//import org.springframework.data.annotation.Id;
//
///**
// * 創建了一個實體類。如合持久化呢？
// * 
// * 使用 @Entity 進行實體類的持久化操作，當 JPA 檢測到我們的實體類當中有 @Entity 註釋的時候，會在數據庫中生成對應的表結構訊息。
// * 
// * @author yuan
// * @version v.0.1
// * @date 2017.09.13
// */
//public class Cat {
//	/**
//	 * 1. 使用 @Id 指定主鍵。 2. 使用 @GeneratedValue(strategy=GenerationType.AUTO)
//	 * 指定主鍵的生成策略，MySQL默認的是自增長。
//	 */
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int id;
//	private String catName; // 姓名. cat_name
//	private String catAge; // 年齡. cat_age
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getCatName() {
//		return catName;
//	}
//
//	public void setCatName(String catName) {
//		this.catName = catName;
//	}
//
//	public String getCatAge() {
//		return catAge;
//	}
//
//	public void setCatAge(String catAge) {
//		this.catAge = catAge;
//	}
//
//}
