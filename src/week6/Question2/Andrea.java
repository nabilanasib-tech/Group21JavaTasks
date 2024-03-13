package week6.Question2;

import java.util.Arrays;

public class Andrea {
    public static void main(String[] args) {
        int[] nums = {50, 60, 40, 20, 10};
        System.out.println(GetMaxValue(nums));
    }

    public static int GetMaxValue(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-1];
    }

}
    /*
    Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */
