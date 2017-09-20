package com.finsage.util.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HelloJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
//		System.err.println("HelloJob.execute(), date= " + new Date());
	}

}
