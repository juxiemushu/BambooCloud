package com.bamboo.common.lock;

import java.util.concurrent.TimeUnit;

/**
 * @author WuWei
 * @date 2020/10/16 3:42 下午
 */

public interface Lock {

    /**
     * 获取锁。如果锁正在被其它线程持有，则当前线程会阻塞，直到获取到锁
     */
    void lock();

    /**
     * 获取锁。如果锁正在被其它线程持有，则当前线程会阻塞，直到获取到锁或响应中断
     *
     * @throws InterruptedException 中断异常
     */
    void lockInterruptibly() throws InterruptedException;

    /**
     * 尝试获取锁。如果锁正在被其他线程持有，当前线程立即返回，不会等待
     *
     * @return  是否成功得到锁
     */
    boolean tryLock();

    /**
     * 尝试获取锁。如果锁正在被其他线程持有，当前线程会等待指定时间。如果在指定时间内还没有办法获取锁，则返回结果
     *
     * @param time  等待时间
     * @param timeUnit  等待时间的单位
     * @return  是否成功得到锁
     */
    boolean tryLock(long time, TimeUnit timeUnit);

    /**
     * 释放锁
     */
    void unlock();

}
