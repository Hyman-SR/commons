package com.hyman.web.commons;

import com.hyman.web.commons.core.annotation.log.EnableHymanLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动入口
 *
 * @author zhangchao
 * @createdOn 2019/5/14
 */
@EnableHymanLog
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
