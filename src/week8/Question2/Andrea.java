package week8.Question2;

/*
 -- Array - n Unique Integers That Sum Up To 0 --

        Write a function that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
            The function can return any such array.
                For example, given N = 4, the function could return [1, 0, -3, 2] or [-2, 1, -4, 5].
                The answer [1, -1, 1, 3] would be incorrect (because value 1 occurs twice).
                For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).
 */

import java.util.Arrays;

public class Andrea {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(4)));
    }

    public static int[] sumZero(int n) {
        int[] answer = new int[n];
        for (int i = 1; i<n; i+=2) {
            answer[i-1]=i;
            answer[i]=-i;
        }
        return answer;
    }
}

// The most important thing to remember here is that when we initialize array in JAVA all the elements are set to zero initially.
// In this approach, we are setting two elements in a single iteration.
// First we set i-1 to positive i value and i to negative i value which cancels each other out
// and increment i by 2.
// Now even when n is odd we only set even number of elements and
// the remaining one element in the end is already "zero" so it does not affect the solution.