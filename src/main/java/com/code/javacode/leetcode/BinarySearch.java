package com.code.javacode.leetcode;

import com.google.gson.Gson;
import java.util.stream.IntStream;

/**
 * # example1
 * Input: nums = [-1, 0, 3, 5, 9, 12] , target = 9
 * Output: int index=> 4, nums[4] = 9
 *
 * Input: nums = [-1, 0, 3, 5, 9, 12] , target = 2
 * Output: int index=> -1, there is no 2 in nums.
 *
 * Input: nums = [5] , target = 5
 * Output: int index=> 0, nums[0] = 5
 */
public class BinarySearch {

    public int bin_search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        support_show(0, start, end, nums);

        while (start<=end){
            int mid = start + (end - start)/2;
            if(target > nums[mid]){
                start = mid + 1;
                support_show(mid, start, end, nums);
            }
            else if(target < nums[mid]){
                end = mid - 1;
                support_show(mid, start, end, nums);
            }
            else {
                support_show(mid, start, end, nums);
                return mid;
            }
        }
        return -1;
    }

    public void support_show(int mid, int start, int end, int[] nums){
        System.out.println("mid: " + mid + "=>nums[mid]: " + (mid==0? 0: nums[mid]) + ", start: " + start + ", end: " + end);
        System.out.println(new Gson().toJson(IntStream.rangeClosed(start, end).mapToObj(m->nums[m]).toArray()));
        System.out.println();
    }

}
