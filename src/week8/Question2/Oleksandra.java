package week8.Question2;

import java.util.Arrays;

public class Oleksandra {

/*
 -- Array - n Unique Integers That Sum Up To 0 --

                Write a function that, given an integer N (1 < N < 100), returns an array containing
                N unique integers that sum up to 0.
                The function can return any such array.
                For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
                The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
                For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */
public static void main(String[] args) {
    int n = 4;
    System.out.println("N: " + n);
    System.out.println("Array: " + Arrays.toString(arrayOfIntegersWithZeroSum(n)));
}

    public static int[] arrayOfIntegersWithZeroSum(int N) {
        if (N < 2 || N > 100) {
            throw new IllegalArgumentException("N must be between 2 and 100");
        }    int c = (N - 1) / 2;
        int f = N % 2 == 0 ? 0 : 1;
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            if (i < c) {
                result[i] = i + 1 - f;
            } else {
                result[i] = -(i - c + 1 + f);
            }
        }
        return result;}
}
