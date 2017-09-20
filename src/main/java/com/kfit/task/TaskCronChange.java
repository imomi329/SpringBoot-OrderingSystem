package com.kfit.task;

import java.util.Date;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.web.bind.annotation.RestController;


/**
 * 動態修改 cron 參數
 * @author yuan
 * @version v.0.1
 * @date 2017.09.14
 */
@RestController
@EnableScheduling
public class TaskCronChange implements SchedulingConfigurer {

	// 秒、分鐘、小時、日期、月份、星期、年(可選).
	private String expression = "0 0/5 * * * *"; // 每 5秒執行一次定時任務

//	@RequestMapping("/changeExpression")
//	public String changeExpression() {
//		expression = "0/10 * * * * *"; // 每 10秒執行一次定時任務
//		System.out.println("changeExpression");
//		return "changeExpression";
//	}

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {

		Runnable task = new Runnable() {
			@Override
			public void run() {
				System.out.println("configureTasks.run(), " + new Date());
			}
		};

		Trigger trigger = new Trigger() {

			@Override
			public Date nextExecutionTime(TriggerContext triggerContext) {
				CronTrigger cronTrigger = new CronTrigger(expression);
				return cronTrigger.nextExecutionTime(triggerContext);
			}
		};
		taskRegistrar.addTriggerTask(task, trigger);
	}

}
