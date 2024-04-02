package week7.Q1_FindMinimum;

public class Batdorj {

    public static int findMin(int[] arr) {
        //The findMin method iterates through the array and keeps track of the minimum value encountered.

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null.");
        //It throws an exception if the input array is empty or null.
        }

        int min = arr[0]; // Initialize min with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] numbers = { 99, 12, 23, 32, 44, 57, 6, -99 };

        int minNumber = findMin(numbers);
        System.out.println("The minimum number in the array is: " + minNumber);
    }
}
