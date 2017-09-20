package com.finsage;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * 這裡使用 @SpringBootApplication 指定是一個 Spring Boot 的應用程序。
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.13
 */
@SpringBootApplication
// @ServletComponentScan // 啟動 servlet 掃描。
@ComponentScan(basePackages = { "com.finsage" }) // 啟動包目錄
@MapperScan(basePackages = { "com.finsage.*.*.mapper", "com.finsage.*.mapper" }) // 掃描該包下相應的 class ，主要是 MyBatis 持久化類
public class App extends WebMvcConfigurerAdapter {

	/**
	 * Fast Jason
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		/*
		 * 1. 需要先定義一個 convert 轉換消息的對象; 2. 添加 fastJson 的配置訊息。比如：是否要格式化回傳 json數據;
		 * 3. 在 convert 中添加配置訊息; 4. 將 convert 添加到 converters 當中;
		 */

		// 1. 需要先定義一個 convert 轉換消息的對象;
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
		// 2. 添加 fastJson 的配置訊息。比如：是否要格式化回傳 json數據;
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		// 处理中文乱码问题
		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		fastConverter.setSupportedMediaTypes(fastMediaTypes);
		// 3. 在 convert 中添加配置訊息;
		fastConverter.setFastJsonConfig(fastJsonConfig);
		// 4. 將 convert 添加到 converters 當中;
		converters.add(fastConverter);
	}

	// @Bean
	// public ServletRegistrationBean myServlet1() {
	// return new ServletRegistrationBean(new MyServlet1(), "/myServlet1");
	// }

	public static void main(String[] args) throws Exception {
		/*
		 * 在 main 方法進行啟動我們的應用程序
		 */
		System.out.println("<<<<<  Spring Boot!!!  >>>>>");
		SpringApplication.run(App.class, args);
	}

}
