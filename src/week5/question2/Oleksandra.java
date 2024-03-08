package week5.question2;

public class Oleksandra {
    public static String reverseString(String input) {
        // Convert the string to a char array for easier manipulation
        char[] charArray = input.toCharArray();

        // Initialize pointers for the start and end of the array
        int start = 0;
        int end = charArray.length - 1;

        // Reverse the characters in the array using a two-pointer approach
        while (start < end) {
            // Swap characters at the start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards each other
            start++;
            end--;
        }

        // Convert the char array back to a string
        String reversedString = new String(charArray);

        // Return the reversed string
        return reversedString;
    }

    // Example usage
    public static void main(String[] args) {
        String inputString = "ABCD";
        String reversedResult = reverseString(inputString);
        System.out.println(reversedResult);
    }
}
/*

    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA

 */