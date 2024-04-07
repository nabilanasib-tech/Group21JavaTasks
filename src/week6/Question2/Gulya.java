package week6.Question2;

public class Gulya {

 /*
    Find Maximum:
  Write a method that can find the maximum number from an int Array.
     */


    public static int findMaximum(int[] numbers) {
            // Check if the array is empty
            if (numbers.length == 0) {
                throw new IllegalArgumentException("Array is empty");
            }

            // Initialize max to the first element of the array
            int max = numbers[0];

            // Iterate through the array starting from the second element
            // Update max if a larger element is found
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            return max;
        }

        public static void main(String[] args) {
            int[] numbers = {10, 5, 20, 15, 30};
            System.out.println("Maximum number: " + findMaximum(numbers));
        }
    }
