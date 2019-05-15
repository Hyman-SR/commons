package com.hyman.web.commons.core.annotation.log;

import com.hyman.web.commons.core.aspect.HymanLogProcessor;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 启用HymanLog
 *
 * @author zhangchao
 * @createdOn 2019/5/14
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(HymanLogProcessor.class)
public @interface EnableHymanLog {
}
