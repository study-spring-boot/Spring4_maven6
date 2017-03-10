package com.xywei.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class Test1 {

	public void test() {
		System.out.println("hello");
	}

	/**
	 * 使用fixedRate属性，每隔一段时间运行
	 */
	@Scheduled(fixedDelay = 5000)
	public void fixedRateRun() {

		System.out.println("每隔一段时间" + new Date());
	}

	@Scheduled(cron = "0 13 17 ? * *")
	public void cronRun() {
		System.out.println("每天运行");
	}

}
