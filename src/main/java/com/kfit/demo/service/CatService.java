//package com.kfit.demo.service;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.kfit.demo.bean.Cat;
//import com.kfit.demo.repository.CatRepository;
//
//@Service
//public class CatService {
//	
//	@Resource
//	private CatRepository catRepository;
//	/**
//	 * save, update, delete 方法需要綁定事務
//	 * 使用 @Transactional 進行事務的綁定
//	 * @param cat
//	 */
//	
//	// 保存數據.
//	@Transactional
//	public void save(Cat cat) {
//		catRepository.save(cat);
//	}
//	
//	// 刪除數據.
//	@Transactional
//	public void delete(int id) {
//		catRepository.delete(id);
//	}
//	
//	// 查詢數據.
//	@Transactional
//	public Iterable<Cat> getAll() {
//		return catRepository.findAll();
//	}
//
//}
