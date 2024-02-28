package week04.question3;

public class Oleksandra {

    public static String removeDuplicates(String input) {
        // Use a StringBuilder to build the result without duplicates
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            // Append the character to the result if it's not already present
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        // Convert StringBuilder to String and return
        return result.toString();
    }

    public static void main(String[] args) {
        // Example input string
        String inputString = "AAABBBCCC";

        // Remove duplicates using the method
        String stringWithoutDuplicates = removeDuplicates(inputString);

        // Display the result
        System.out.println("Original String: " + inputString);
        System.out.println("String without Duplicates: " + stringWithoutDuplicates);
    }
}

/*
 String - Remove Duplicates

Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */