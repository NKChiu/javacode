package com.code.javacode.leetcode;

import com.google.gson.Gson;

import java.util.HashMap;

/**
 * # example1
 * Input: nums = [2,7,11,15] , target = 9
 * Output: [0,1] => nums[0] + nums[1] = 9
 */
public class TwoSum {

    public int[] twosum_1(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    public int[] twosum_2(int[] nums, int target){
        HashMap m = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (m.containsKey(t)) {
                return new int[]{i, (int) m.get(t)};
            }
            m.put(nums[i], i);
            //System.out.println(new Gson().toJson(m));
        }

        return new int[]{};
    }


}
