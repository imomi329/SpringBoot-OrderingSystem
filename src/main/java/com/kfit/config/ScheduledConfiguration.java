package com.kfit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.MethodInvokingJobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

import com.kfit.task.ScheduledTasks;

@Configuration
public class ScheduledConfiguration {
	
//	/*
//	 * 定義 JobDetail
//	 * @param scheduledTasks
//	 * @return
//	 */
//	@Bean
//	public MethodInvokingJobDetailFactoryBean detailFactoryBean(ScheduledTasks scheduledTasks) {
//		MethodInvokingJobDetailFactoryBean bean = new MethodInvokingJobDetailFactoryBean();
//		// 設置對應的 Job 對象
//		bean.setTargetObject(scheduledTasks);
//		// 設置 scheduledTasks 對應的方法名
//		bean.setTargetMethod("excute");
//		return bean;
//	}
//	
//	/*
//	 * 定義 Trigger
//	 * @return
//	 */
//	@Bean
//	public CronTriggerFactoryBean cronTriggerFactoryBean(MethodInvokingJobDetailFactoryBean jobDetail) {
//		CronTriggerFactoryBean trigger = new CronTriggerFactoryBean();
//		trigger.setJobDetail(jobDetail.getObject());
////		trigger.setCronExpression("0/5 * * ? * *"); // 每 5秒執行一次
//		return trigger;
//	}
//	
//	/*
//	 * 定義 Scheduler
//	 */
//	@Bean
//	public SchedulerFactoryBean schedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBean) {
//		SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
//		schedulerFactoryBean.setTriggers(cronTriggerFactoryBean.getObject());
//		return schedulerFactoryBean;
//	}

}
