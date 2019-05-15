package com.hyman.web.commons.utils;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;


/**
 * @author zhangchao
 * @createdOn 2019/5/14
 */
public class BeanRegistrationUtils {

    public static void registerBeanDefinitionIfNotExists(BeanDefinitionRegistry registry, Class<?> beanClass) {
        //如果该bean已存在，直接跳过
        if (registry.containsBeanDefinition(beanClass.getName())) {
            return;
        }
        AbstractBeanDefinition abstractBeanDefinition = BeanDefinitionBuilder.genericBeanDefinition(beanClass).getBeanDefinition();
        registry.registerBeanDefinition(beanClass.getName(), abstractBeanDefinition);
    }

}
