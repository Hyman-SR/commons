package com.hyman.web.commons.utils;

import com.hyman.web.commons.utils.extra.ActuallyUserService;
import org.junit.Test;

import java.lang.reflect.Type;

public class GenericsUtilsTest {

    @Test
    public void getClazzGenericType() {
        Type type = GenericsUtils.getClazzGenericType(ActuallyUserService.class, 0);
        assert type != null;
    }
}