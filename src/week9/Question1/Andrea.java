package week9.Question1;

import java.util.Arrays;

public class Andrea {

    /*
    1 - Array_concat2Arrays -
    Write a return method that can concatenate two arrays
     */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : arr1) {
            result[pos] = element;
            pos++;
        }

        for (int element : arr2) {
            result[pos] = element;
            pos++;
        }

        return result;
    }
}