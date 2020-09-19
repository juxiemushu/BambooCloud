package com.bamboo.common.extension;

import java.lang.annotation.*;

/**
 * @author WuWei
 * @date 2020/9/18 4:58 下午
 */

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface SPI {

    /**
     * 设置可扩展的接口名称
     *
     * @return  可扩展的接口名称
     */
    String value() default "";

}
