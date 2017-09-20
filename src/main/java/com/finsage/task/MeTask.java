package com.finsage.task;

import javax.annotation.PostConstruct;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finsage.job.HeyJob;

// extends BaseTask 
@Service
public class MeTask {

//	@Autowired
//	private Scheduler scheduler;
//
//	@PostConstruct // 等同於 init-medthod
//	public void init() {
//
//		// 定義 JobDetail
//		JobDetail jobDetail = JobBuilder.newJob(HeyJob.class).withIdentity("job1", "group1").build();
//		// 定義 Trigger
//		SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5)
//				.repeatForever();
//		Trigger trigger = TriggerBuilder.newTrigger().withIdentity("trigger1", "group1").startNow()
//				.withSchedule(simpleScheduleBuilder).build();
//		// 啟動 Job
//		try {
//			scheduler.scheduleJob(jobDetail, trigger);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/*
	 * 為什麼 helloService = null ?
	 * --------------------------------------------------
	 * Quartz 中的 Job 是由 Quartz 框架『動態』創建的 (通過配置該 Job 的 className，通過反射進行動態創建) ，所以
	 * 在 Job 中使用 spring bean 的話，是無法進行使用的。 ( Job 的類，不是一個 spring bean )
	 * 
	 * 如何將我們的 job 交給 spring 進行管理
	 * --------------------------------------------------
	 * 使用 AutowireCapableBeanFactory 進行自動注入 job.
	 */
//	@Resource
//	private HelloService helloService;
//
//	@Override
//	public void execute(JobExecutionContext context) throws JobExecutionException {
//		System.out.println("MeTask.execute().new, date = " + new Date());
//		helloService.hello();
//	}
//
//	@Override
//	public String getCronExpression() {
//		return "0/3 * * * * *";
//	}
	
}
