package week8.Question1;

import java.util.Arrays;

/*
 -- Array - Move Zeroes to the end --

        Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
            input:  {1, 0, 2, 0, 3, 0, 4, 0};
            output: [1, 2, 3, 4, 0, 0, 0, 0]

 */
public class Andrea {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        System.out.println(Arrays.toString(arr));

    }

    public static void pushZerosToEnd(int[] arr, int n) {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is not zero,
        // then replace the element at index 'count' with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is incremented

        // Now all non-zero elements have been shifted to front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }
}
