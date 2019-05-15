package com.hyman.web.commons.core.aspect;


import com.hyman.web.commons.core.annotation.log.HymanLog;
import com.hyman.web.commons.utils.ArrayUtils;
import com.hyman.web.commons.utils.BeanRegistrationUtils;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;

/**
 * 日志处理器
 *
 * @author zhangchao
 * @createdOn 2019/5/14
 */
@Aspect
@Slf4j
public class HymanLogProcessor implements ImportBeanDefinitionRegistrar {

    /**
     * 处理日志
     */
    @Around("@within(hymanLog)")
    public Object handleLog(ProceedingJoinPoint pjp, HymanLog hymanLog) throws Throwable {
        if (ArrayUtils.asList(hymanLog.exclude()).contains(pjp.getSignature().getName())) {
            return pjp.proceed();
        }
        long start = System.currentTimeMillis();
        try {
            log.debug("==> {}.{}({})", pjp.getTarget().getClass().getSimpleName(), pjp.getSignature().getName(), pjp.getArgs());
            Object result = pjp.proceed();
            log.debug("==> {}.{}[{}ms]", pjp.getTarget().getClass().getSimpleName(), pjp.getSignature().getName(), System.currentTimeMillis() - start);
            return result;
        } catch (Exception e) {
            log.warn("==> {}.{}[{}ms]", pjp.getTarget().getClass().getSimpleName(), pjp.getSignature().getName(), System.currentTimeMillis() - start);
            throw e;
        }
    }

    /**
     * 将该bean注入到spring中
     *
     * @param annotationMetadata
     * @param beanDefinitionRegistry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanRegistrationUtils.registerBeanDefinitionIfNotExists(beanDefinitionRegistry, HymanLogProcessor.class);
    }
}
