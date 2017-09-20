package com.finsage.util.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class HeyJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
//		System.err.println("HeyJob.execute(), date= " + new Date());
	}

}
