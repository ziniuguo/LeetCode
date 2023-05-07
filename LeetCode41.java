package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class LeetCode41 {
    public static void main(String[] args) {
        int[] numsIn = new int[]{};
//        System.out.println(memoryLimitExceededFirstMissingPositive(numsIn));
        System.out.println(firstMissingPositive(numsIn));
    }
    // first missing positive
    public static int firstMissingPositive(int[] nums) {
        // instead of using an ArrayList, use a HashMap here.
        int pointer = 1;
        HashMap<Integer, Boolean> recordMap = new HashMap<>();
        for (int num : nums) {
            if (num >= 0) {
                recordMap.put(num, Boolean.TRUE);
            }
        }
        while (true) {
            Boolean exist = recordMap.get(pointer);
            if (exist != null) {
                pointer ++;
            } else {
                return pointer;
            }
        }
    }

    public static int memoryLimitExceededFirstMissingPositive(int[] nums) {
        // indicating we are looking for 1
        // (1 is currently missing)
        int pointer = 0;
        // find max no.
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxNumber) {
                maxNumber = nums[i];
            }
        }
        if (maxNumber <= 0) {
            // this got 2 edge cases
            // 1. empty array
            // 2. all negative, no maxNumber
            return 1;
        }
        ArrayList<Boolean> recordList = new ArrayList<>(
                maxNumber
        );
        // initiate it
        for (int i = 0; i < maxNumber; i++) {
            // add from 0
            recordList.add(Boolean.FALSE);
        }
        // loop through given nums
        for (int num : nums) {
            if (num <= 0) {continue;}
            recordList.set(num - 1, Boolean.TRUE);
            if (num - 1 == pointer) {
                // move pointer
                do {
                    pointer++;
                } while (pointer < maxNumber && recordList.get(pointer) == Boolean.TRUE);
            }
        }
        return pointer + 1;
    }
}