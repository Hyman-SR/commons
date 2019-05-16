package com.hyman.web.commons.utils;

import org.springframework.util.Assert;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author zaki
 * @date 2019年5月16日
 */
public class GenericsUtils {


    /**
     * Gets actual generic type.
     *
     * @param index generic type index
     * @return real generic type will be returned
     */
    public static Type getClazzGenericType(Class clazz, int index) {
        Assert.isTrue(index >= 0, "index must be greater than 0");
        ParameterizedType type = (ParameterizedType) clazz.getGenericSuperclass();
        return type.getActualTypeArguments()[index];
    }
}
