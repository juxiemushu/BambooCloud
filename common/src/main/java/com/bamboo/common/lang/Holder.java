package com.bamboo.common.lang;

/**
 * @author WuWei
 * @date 2020/9/21 4:04 下午
 *
 * 类似于对象容器，意义待定
 */

public class Holder<T> {

    private volatile T value;

    public T get() {
        return this.value;
    }

    public void set(T value) {
        this.value = value;
    }

}
