package com.ylxn.leetcode;

import java.util.HashMap;

/**
 * 2022-06-06
 * 1. 两数之和
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 */
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] ints = twoSum(nums, 9);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        //1，创建一个hashmap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //2，遍历数组
        for (int i = 0; i < nums.length; i++) {
            //3，如果hashmap中存在当target-当前遍历值，则返回hashmap中找到的值的value，以及当前遍历值的索引。
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            //4，不存在，则将值放入到hashmap中，供下次循环使用。
            hashMap.put(nums[i], i);
        }
        throw new RuntimeException("No such tow numbers");
    }
}
