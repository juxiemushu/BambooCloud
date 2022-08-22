package com.bamboo.common.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author WuWei
 * @date 2021/11/3 7:56 下午
 * <p>
 * Spring应用上下文持有器
 */

@Component
public class SpringContextHolder implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;
    }

    /**
     * 获取 Spring 应用上下文
     *
     * @return Spring 应用上下文
     */
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    /**
     * 根据 Bean 名称获取 Bean
     *
     * @param name Bean 名称
     * @param <T>  Bean 类型
     * @return Spring IOC 容器中与 name 匹配的 Bean
     */
    public static <T> T getBean(String name) {
        return (T) applicationContext.getBean(name);
    }

    /**
     * 根据 Bean 类型获取 Bean
     *
     * @param tClass Bean 类型
     * @param <T>    Bean 类型
     * @return Spring IOC 容器中与 tClass 匹配的 Bean
     */
    public static <T> T getBean(Class<T> tClass) {
        return applicationContext.getBean(tClass);
    }

    /**
     * 根据 Bean 类型获取 Bean 集合，一般用于接口或抽象类有多个实现的情况
     *
     * @param tClass Bean 类型
     * @param <T>    Bean 类型
     * @return Spring IOC 容器中与 tClass 匹配的 Bean
     */
    public static <T> Map<String, T> getBeans(Class<T> tClass) {
        return applicationContext.getBeansOfType(tClass);
    }

}
