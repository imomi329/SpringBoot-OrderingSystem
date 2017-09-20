package com.finsage.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.github.pagehelper.PageHelper;

@Configuration
public class MybatisConfiguration {

//	@Bean
//	public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception {
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource);
//		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//		Interceptor[] plugins = new Interceptor[] { pageHelper() };
//		sqlSessionFactoryBean.setPlugins(plugins);
//		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
//		return sqlSessionFactoryBean.getObject();
//	}

	/**
	 * 註冊 Mybatis 分頁插件 PageHelper
	 * 
	 * @return
	 */
	@Bean
	public PageHelper pageHelper() {
		System.out.println("MybatisConfiguration.pageHelper()");
		PageHelper pageHelper = new PageHelper();
		Properties p = new Properties();
		p.setProperty("offSetAsPageNum", "ture");
		p.setProperty("rowBoundsWithCount", "ture");
		p.setProperty("reasonable", "ture");
		pageHelper.setProperties(p);
		return pageHelper;
	}

}
