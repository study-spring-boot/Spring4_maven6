package com.xywei.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xywei.config.ConfigBean;

public class SchedulingTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(
				ConfigBean.class);

	}
}
