package com.bamboo.common.spi;

import com.bamboo.common.extension.ExtensionLoader;

/**
 * @author WuWei
 * @date 2020/9/2 2:21 下午
 */
public class SpiMain {

    public static void main(String[] args) {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);
        HelloService worldHelloService = extensionLoader.getExtension("world");
        worldHelloService.sayHello("world");

        System.out.println("--------------------*****************--------------------");

        HelloService catHelloService = extensionLoader.getExtension("cat");
        catHelloService.sayHello("cat");
    }

}
