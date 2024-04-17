package week6.Question2;

public class Batdorj {

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty or null.");
        }

        int max = arr[0]; // Initialize max with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 12, 5, 8, 20, 3, 15 };

        int maxNumber = findMax(numbers);
        System.out.println("The maximum number in the array is: " + maxNumber);
    }
    /*
    Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */
}
