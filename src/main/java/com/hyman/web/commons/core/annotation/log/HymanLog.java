package com.hyman.web.commons.core.annotation.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 统计方法的执行时间
 *
 * @author zhangchao
 * @createdOn 2019/5/14
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface HymanLog {
    /**
     * 标注不统计哪些方法
     *
     * @return
     */
    String[] exclude() default {};

    /**
     * 标注统计时延超过指定数值的方法
      */
    long millisecond() default 0L;
}
