package week8;

import java.util.Arrays;

public class Q2_NuniqueIntegersThatSumUpTo0 {

    public static void main(String[] args) {
        int N = 4;
        int[] result = generateUniqueIntegers(N);
        System.out.println("Generated array: " + Arrays.toString(result));
    }

    public static int[] generateUniqueIntegers(int N) {
        int[] arr = new int[N];

        // Generate N/2 positive integers from 1 to N/2
        // and store them in the first half of the array.
        for (int i = 0; i < N / 2; i++) {
            arr[i] = i + 1;
        }

        // Generate N/2 negative integers from -N/2 to -1
        // and store them in the second half of the array.
        for (int i = N / 2; i < N; i++) {
            arr[i] = -(i - N / 2 + 1);
        }

        return arr;
    }
    /**
     * Array_NuniqueIntegersThatSumUpTo0
     * Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
     * The function can return any such array. For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
     * The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
     * For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
     */

    /*
    public static void main(String[] args) {
        int N = 4;
        int[] result = generateUniqueIntegers(N);
        System.out.println("Generated array: " + Arrays.toString(result));
    }

    public static int[] generateUniqueIntegers(int N) {
        int[] arr = new int[N];

        // Generate N-1 positive integers
        for (int i = 0; i < N - 1; i++) {
            arr[i] = i + 1;
        }

        // Calculate the negative integer to make the sum zero
        int negativeSum = (N * (N - 1)) / 2;
        arr[N - 1] = -negativeSum;

        return arr;
    }
     */

}
