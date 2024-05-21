package com.code.javacode.leetcode;

import static org.junit.jupiter.api.Assertions.*; //must be static
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;


public class BinarySearchTest {

    @DisplayName("BinarySearchTest")
    @ParameterizedTest(name = "{index} {0}")
    @MethodSource("com.code.javacode.leetcode.BinarySearchTest#sourceMethod")
    public void test_BinarySearch(String name, int[] nums, int target){
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.bin_search(nums, target);

        if(index != -1){
            assertEquals(target, nums[index]);
        }else{
            assertEquals(-1, index);
        }

    }

    /**
     * case arguments
     * @return
     */
    public static Stream<Arguments> sourceMethod(){
        return Stream.of(
                Arguments.of("Case 1",new int[] {-1,0,3,5,9,12}, 9),
                Arguments.of("Case 2", new int[] {3,2,4}, 6),
                Arguments.of("Case 3", new int[] {3}, 3)
        );
    }
}
