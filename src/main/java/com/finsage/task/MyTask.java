package com.finsage.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 運行結果： ((預估運行開始時間為 40秒前))
	MyTask.task1()
	MyTask.task1()
	MyTask.task1()
	MyTask.task2()
	MyTask.task1()
 * ------------------------------
 * MyTask.task1() ： 每10秒印一次
 * MyTask.task2() ： 每1分鐘印一次
 * ------------------------------
 * 1分鐘是60秒 = 每打印6次 MyTask.task1() 之後才能打印一次 MyTask.task2()
 * ------------------------------
 * spring task 在計算時間的時候，是根據當時服務器的系統時間進行計算。
 * ------------------------------
 * 
 * spring boot 定時任務
 * @author yuan
 * @version v.0.1
 * @date 2017.09.14
 */
@Configuration
@EnableScheduling
public class MyTask {
	
	/*
	 * 這個方法每 10 秒打印一次
	 * corn：定時任務表達式
	 * 
	 * 指定：秒、分鐘、小時、日期、月份、星期、年(可選).	// *:任意
	 */
//	@Scheduled(cron="0/10 * * * * *")
//	public void task1() {
//		System.err.println("MyTask.task1()");
////		System.out.println(new Data());
//	}
	
	/*
	 * 這個方法每 1 分鐘打印一次
	 */
//	@Scheduled(cron="0 0/1 * * * *")
//	public void task2() {
//		System.err.println("MyTask.task2()");
////		System.out.println(new Data());
//	}

}
