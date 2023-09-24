package com.leetcode;

public class RemoveDuplicatesFromArray {
    public static int removeDuplicates(int[] nums) {
        // Length of the updated array
        int count = 0;
        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will put the unique values tp a new array
            nums[count] = nums[i];
            count++;
        }

        int[] expectedNums = new int[count];

        for (int i = 0; i < expectedNums.length; i++) {
            expectedNums[i] = nums[i];
            System.out.println(expectedNums[i]);
        }
        System.out.println("===============");
        return count;
    }


    public static void main(String[] args) {

        int nums[] = {0,0,0,1,1,2,3,4,4,4,4,5,6,6};

        System.out.println("After removing duplicates, number of digits in the result is:"+
                removeDuplicates(nums));
    }
}