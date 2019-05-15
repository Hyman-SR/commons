package com.hyman.web.commons.controller;

import com.hyman.web.commons.core.annotation.log.HymanLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangchao
 * @createdOn 2019/5/14
 */
@RestController
@HymanLog(exclude = {"test2"}, millisecond = 20)
public class TestAnnotationController {

    @GetMapping("/api/1")
    public void test1(TestForm form) {
        System.out.println(form.getId() + "===" + form.getName());
    }

    @GetMapping("/api/2")
    public void test2() {
        System.out.println(222);
    }
}
