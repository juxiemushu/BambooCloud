package com.bamboo.common.utils;

/**
 * @author WuWei
 * @date 2020/9/18 5:18 下午
 */
public class ClassUtils {

    public static ClassLoader getClassLoader(Class<?> clazz) {
        ClassLoader loader = null;

        try {
            loader = Thread.currentThread().getContextClassLoader();
        } catch (Exception e) {

        }

        return loader;
    }

}
