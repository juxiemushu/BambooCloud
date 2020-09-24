package com.bamboo.common.extension;

import java.lang.annotation.*;

/**
 * @author WuWei
 * @date 2020/9/21 11:54 下午
 *
 * 可扩展服务实现类上使用，设置实现类的别名
 * 非必须，实现类上使用该注解后，配置文件中可以只配置实现类的路径
 */

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SPIInstance {

    /**
     * 可扩展服务接口实例
     *
     * @return  实例别名
     */
    String alisName();

}
