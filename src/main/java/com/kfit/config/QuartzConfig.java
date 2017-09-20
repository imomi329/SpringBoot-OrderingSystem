package com.kfit.config;

import org.quartz.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * quartz 的配置類.
 * 
 * @author yuan
 * @version v.0.1
 * @date 2017.09.14
 */
@Configuration
public class QuartzConfig {
	
//	@Autowired
//	private	SpringBeanJobFactory springBeanJobFactory;
//	
//	@Bean
//	public SchedulerFactoryBean schedulerFactoryBean() {
//		SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
//		// 把 Job 交給 spring 來管理，這樣就能使用 spring 產生的 bean 了。
//		schedulerFactoryBean.setJobFactory(springBeanJobFactory);
//		return schedulerFactoryBean;
//	}
//	
//	@Bean
//	public Scheduler scheduler() {
//		return schedulerFactoryBean().getScheduler();
//	}
	
}
