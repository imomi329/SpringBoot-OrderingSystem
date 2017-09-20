package com.finsage.util.task;

public class BaseTask {
	
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
//
//	public void execute(JobExecutionContext context) throws JobExecutionException {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public String getCronExpression() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
