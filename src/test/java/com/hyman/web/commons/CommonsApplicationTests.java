package com.hyman.web.commons;

import com.hyman.web.commons.core.annotation.log.HymanLog;
import com.hyman.web.commons.core.aspect.HymanLogProcessor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@HymanLog(exclude = {"contextLoads", "test"}, millisecond = 10)
public class CommonsApplicationTests {

	@Test
	public void contextLoads() {

	}

	public static void main(String[] args) {
		System.out.println(HymanLogProcessor.class.getName());
	}

}
