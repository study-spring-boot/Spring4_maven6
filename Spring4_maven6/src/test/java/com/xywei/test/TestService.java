package com.xywei.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xywei.config.ConfigBean;
import com.xywei.service.Test1;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigBean.class)
public class TestService {
	@Autowired
	private Test1 test1;

	@Test
	public void test() {
		test1.test();
	}

	/**
	 * 测试定时任务
	 */
	@Test
	public void test1() {

	}

}
