package com.jobscheduler;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobExecutor {
	
	private static final Logger logger = LoggerFactory.getLogger(JobExecutor.class);
	
//	@Scheduled(initialDelay = 10000, fixedDelay = 30000)
	@Scheduled(cron = "1 * * * * *")
	public void startJob() {
		
		System.out.println("Hello");
		logger.info("The job is running : {} " + new Date());
		
	}

}
