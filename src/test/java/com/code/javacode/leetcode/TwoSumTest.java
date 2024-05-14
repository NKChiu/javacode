package com.code.javacode.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwoSumTest {

    @DisplayName("TwoSumTest")
    @ParameterizedTest(name = "{index} {0}")
    @MethodSource("com.code.javacode.leetcode.TwoSumTest#sourceMethod")
    public void test_TwoSum_1(String name, int[] input, int target){
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twosum_1(input, target);
        int ans = Arrays.stream(ints).map(i -> input[i]).sum();
        Assertions.assertEquals(target, ans);
    }

    @DisplayName("TwoSumTest")
    @ParameterizedTest(name = "{index} {0}")
    @MethodSource("com.code.javacode.leetcode.TwoSumTest#sourceMethod")
    public void test_TwoSum_2(String name, int[] input, int target){
        TwoSum twoSum = new TwoSum();
        int[] ints = twoSum.twosum_2(input, target);
        int ans = Arrays.stream(ints).map(i -> input[i]).sum();
        Assertions.assertEquals(target, ans);
    }

    /**
     * case arguments
     * @return
     */
    public static Stream<Arguments> sourceMethod(){
        return Stream.of(
                Arguments.of("Case 1",new int[] {2,11,7,15}, 9),
                Arguments.of("Case 2", new int[] {3,2,4}, 6),
                Arguments.of("Case 3", new int[] {3,3}, 6)

        );
    }

}
