package com.finsage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 這裡使用 @SpringBootApplication 指定是一個 Spring Boot 的應用程序。
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
@SpringBootApplication // same as @Configuration, @EnableAutoConfiguration, @ComponentScan
@ComponentScan(basePackages = { "com.finsage" }) // 啟動包目錄
@MapperScan(basePackages = { "com.finsage.*.*.mapper", "com.finsage.*.mapper" }) // 掃描該包下相應的 class ，主要是 MyBatis 持久化類
public class App extends WebMvcConfigurerAdapter {

	public static void main(String[] args) throws Exception {
		/*
		 * 在 main 方法進行啟動我們的應用程序
		 */
		System.out.println("<<<<<  Spring Boot!!!  >>>>>");
		SpringApplication.run(App.class, args);
		// 熱部署(關閉)
//		System.setProperty("spring.devtools.restart.enabled", "false");
	}

}
