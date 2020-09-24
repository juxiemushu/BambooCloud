package com.bamboo.common.spi;

import com.bamboo.common.extension.SPI;

/**
 * @author WuWei
 * @date 2020/9/2 2:15 下午
 */

@SPI
public interface HelloService {

    String sayHello(String word);

}
