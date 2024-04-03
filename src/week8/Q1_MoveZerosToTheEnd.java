package week8;

import java.util.Arrays;

public class Q1_MoveZerosToTheEnd {

    public static void main(String[] args) {

        int[] inputArray = {1, 0, 2, 0, 3, 0, 4, 0};
        moveZeros(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
    public static void moveZeros(int[] arr){

        int nonZeroIndex = 0;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // If the current element is non-zero, swap it with the nonZeroIndex
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;

                // Increment the nonZeroIndex
                nonZeroIndex++;
            }
        }
    }

    /**
     * 1# Array_MoveZerosToTheEnd
     * Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
     * input:  {1,0,2,0,3,0,4,0};
     * output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

}
