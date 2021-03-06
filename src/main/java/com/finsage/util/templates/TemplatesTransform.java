package com.finsage.util.templates;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注意：
 * 1. 在 Thymeleaf 模板文件中，標籤是需要閉合的 (3.0之前是需要閉合的)
 * 2. thymeleaf 3.0+ 是可以不強制要求閉合的
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
@Controller
@RequestMapping("/Web")
public class TemplatesTransform {
	
	/**
	 * 映射地址是：/templates/hello
	 * @return
	 */
	@RequestMapping("/hello")
	public String hello(Map<String, Object> map) {
		map.put("name", "Andy");
		return "hello";
	}

	/**
	 * 可映射所有 /templates/XXXXX.html
	 * @param html
	 * @return
	 */
	@RequestMapping("/Html")
	public String htmlTransFrom(String html) {
		return html;
	}

}
