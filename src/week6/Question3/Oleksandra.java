package week6.Question3;

public class Oleksandra {
     /*
    Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */
     public static int sumOfDigits(String str) {
         int sum = 0;

         // Iterate through each character in the string
         for (char c : str.toCharArray()) {
             // Check if the character is a digit
             if (Character.isDigit(c)) {
                 // If it is a digit, convert it to integer and add to sum
                 sum += Character.getNumericValue(c);
             }
         }

         // Return the sum of digits
         return sum;
     }

    public static void main(String[] args) {
        // Example usage:
        String input = "A3v15";
        int sum = sumOfDigits(input);
        System.out.println("Sum of digits in the string \"" + input + "\": " + sum);
    }
}
/*
This Java method sumOfDigits()
which takes a string as input and returns the sum of all the digits in the string.
It iterates through each character in the string, checks if it's a digit, and if so,
 adds it to the sum.
The main() method demonstrates an example usage of the sumOfDigits() method.
 */
