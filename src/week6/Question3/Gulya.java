package week6.Question3;

public class Gulya {

    /*
       Sum of digits in a string:
     Write a method that can return the sum of the digits in a string.

     Ex: "A3v15" = > 3 + 1 + 5 = 9
           return 9
        */
        public static int sumOfDigits(String str) {
            int sum = 0;

            // Iterate through each character of the string
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Check if the character is a digit
                if (Character.isDigit(ch)) {
                    // Convert the character to integer and add it to the sum
                    sum += Character.getNumericValue(ch);
                }
            }

            return sum;
        }

        public static void main(String[] args) {
            String str = "A3v15";
            System.out.println("Sum of digits: " + sumOfDigits(str));
        }
    }

