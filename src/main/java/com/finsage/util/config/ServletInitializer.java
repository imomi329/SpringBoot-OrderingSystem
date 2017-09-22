package com.finsage.util.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.finsage.App;

/**
 * Servlet 初始化，搭配可進行 jboss 部署
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.20
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(App.class);
	}

}
