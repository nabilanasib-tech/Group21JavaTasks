package week5.question1;

public class Oleksandra {

    public static String findUniqueCharacters(String inputString) {
        // Create a StringBuilder to store unique characters
        StringBuilder uniqueCharacters = new StringBuilder();

        // Iterate through each character in the input string
        for (char currentChar : inputString.toCharArray()) {
            // Check if the character appears only once in the string
            // If the count of the character is 1, it is unique
            if (countOccurrences(inputString, currentChar) == 1) {
                // Append the unique character to the StringBuilder
                uniqueCharacters.append(currentChar);
            }
        }

        // Convert the StringBuilder to a String
        return uniqueCharacters.toString();
    }

    // Helper method to count occurrences of a character in a string
    private static int countOccurrences(String str, char target) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        return count;
    }

    // Example usage
    public static void main(String[] args) {
        String inputStr = "AAABBBCCCDEF";
        String result = findUniqueCharacters(inputStr);
        System.out.println(result);
    }
}
/*
  Write a return  method that can find the unique characters from the String
    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */