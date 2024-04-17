package week8.Question1;

import java.util.Arrays;

public class Oleksandra {
    /*Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    input:  {1, 0, 2, 0, 3, 0, 4, 0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/


    public static void main(String[] args) {
        int[] input = {1, 0, 2, 0, 3, 0, 4, 0};
        // Print the original input array
        System.out.println("Original Array: " + Arrays.toString(input));
        // Call moveZeros method
        moveZeros(input);
        // Print the modified input array
        System.out.println("Modified Array: " + Arrays.toString(input));
    }



    public static void moveZeros(int[] arr) {
        int firstNonZeroIndex = 0;
        // Iterate through the array starting from the first index
        for (int i = 0; i < arr.length; i++) {
            // If the current element is not zero, swap it with the first non-zero element
            if (arr[i] != 0) {
                int temp = arr[firstNonZeroIndex];
                arr[firstNonZeroIndex] = arr[i];
                arr[i] = temp;
                firstNonZeroIndex++; // Move to the next non-zero element
            }
        }
    }
}
