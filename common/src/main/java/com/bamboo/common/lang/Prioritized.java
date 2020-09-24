package com.bamboo.common.lang;

import static java.lang.Integer.compare;

/**
 * @author WuWei
 * @date 2020/9/21 2:43 下午
 */

public interface Prioritized extends Comparable<Prioritized> {

    /**
     * 最高
     */
    int MAX_PRIORITY = Integer.MIN_VALUE;

    /**
     * The minimum priority
     */
    int MIN_PRIORITY = Integer.MAX_VALUE;

    /**
     * Normal Priority
     */
    int NORMAL_PRIORITY = 0;

    default int getPriority() {
        return NORMAL_PRIORITY;
    }

    @Override
    default int compareTo(Prioritized that) {
        return compare(this.getPriority(), that.getPriority());
    }

}
