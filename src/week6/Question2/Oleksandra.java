package week6.Question2;

public class Oleksandra {
    /*Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */

    public static int findMaximum(int[] array) {
        // Check if array is empty or null
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        // Initialize max to the first element of the array
        int max = array[0];

        // Iterate through the array to find the maximum element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Return the maximum element found
        return max;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] array = {5, 10, 3, 8, 15};
        int maxNumber = findMaximum(array);
        System.out.println("Maximum number: " + maxNumber);
    }
}
    /* This Java method findMaximum() which takes an array of integers
    as input and returns the maximum number in the array.
     It iterates through the array elements,
      comparing each element with the current maximum value and updating the maximum value
      if a larger element is found.
       The main() method demonstrates an example usage of the findMaximum() method.
     */