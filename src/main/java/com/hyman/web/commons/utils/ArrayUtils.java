package com.hyman.web.commons.utils;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组工具类
 *
 * @author zhangchao
 * @createdOn 2019/5/14
 */
public class ArrayUtils {
    private ArrayUtils() {}

    public static List<String> asList(String str) {
        if (StringUtils.isEmpty(str)) {
            return new ArrayList<>();
        }
        String[] split = str.split(",");
        List<String> list = new ArrayList<>(split.length);
        for (int i = 0; i < split.length; i++) {
            list.add(split[i].trim());
        }
        return list;
    }

    public static <T> List<T> asList(T... obj) {
        List<T> list = new ArrayList<>(obj.length);
        list.addAll(Arrays.asList(obj));
        return list;
    }


}
