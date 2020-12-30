package com.bamboo.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WuWei
 * @date 2020/12/29 8:51 下午
 */
public class LC0001 {

    public static void main(String[] args) {
        int[] nums = {3, 3};
        int target = 6;
        int[] result = towSum3(nums, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(target == nums[i] + nums[j]) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    private static int[] towSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> tempMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            tempMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int count = target - nums[i];
            if(tempMap.containsKey(count) && tempMap.get(count) != i) {
                result[0] = i;
                result[1] = tempMap.get(count);
                break;
            }
        }

        return result;
    }

    private static int[] towSum3(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> tempMap = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int count = target - nums[i];
            if(tempMap.containsKey(count) && tempMap.get(count) != i) {
                result[0] = tempMap.get(count);
                result[1] = i;
                break;
            }
            tempMap.put(nums[i], i);
        }

        return result;
    }

}
