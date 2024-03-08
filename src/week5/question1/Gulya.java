package week5.question1;

public class Gulya {

    /*
        Write a return  method that can find the unique characters from the String
        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
         */
        public static String unique(String input) {
            StringBuilder result = new StringBuilder();

            // Iterate through each character in the input string
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                boolean isUnique = true;

                // Check if the current character is unique
                for (int j = 0; j < input.length(); j++) {
                    if (i != j && input.charAt(j) == currentChar) {
                        isUnique = false;
                        break;
                    }
                }

                // If the current character is unique, add it to the result
                if (isUnique) {
                    result.append(currentChar);
                }
            }

            return result.toString();
        }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        System.out.println("Unique characters: " + unique(input)); // Output: DEF
    }
}