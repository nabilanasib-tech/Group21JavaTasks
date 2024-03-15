package week6.Question1;

public class Gulya {
 /*
    Password Validation Task:
  Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least have 6 characters and should not contain space,
    2. Password should at least contain one upper case letter,
    3. PassWord should at least contain one lowercase letter,
    4. Password should at least contain one special characters,
  5. Password should at least contain a digit.

if all requirements above are met, the method returns true, otherwise returns false.
     */

     public static boolean isValidPassword(String password) {
         // Requirement 1: Password length should be at least 6 characters and should not contain space
         if (password.length() < 6 || password.contains(" ")) {
             return false;
         }

         // Requirement 2: Password should contain at least one upper case letter
         boolean hasUpperCase = false;
         // Requirement 3: Password should contain at least one lower case letter
         boolean hasLowerCase = false;
         // Requirement 4: Password should contain at least one special character
         boolean hasSpecialChar = false;
         // Requirement 5: Password should contain at least one digit
         boolean hasDigit = false;

         // Iterate through each character of the password
         for (char c : password.toCharArray()) {
             // Check if the character is an upper case letter
             if (Character.isUpperCase(c)) {
                 hasUpperCase = true;
             }
             // Check if the character is a lower case letter
             else if (Character.isLowerCase(c)) {
                 hasLowerCase = true;
             }
             // Check if the character is a digit
             else if (Character.isDigit(c)) {
                 hasDigit = true;
             }
             // Check if the character is a special character (assuming anything other than letters or digits as special)
             else {
                 hasSpecialChar = true;
             }
         }

         // Check if all requirements are met
         return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
     }

     public static void main(String[] args) {
         // Test cases
         System.out.println(isValidPassword("Passw0rd")); // true
         System.out.println(isValidPassword("weak")); // false (doesn't meet length requirement)
         System.out.println(isValidPassword("Strong")); // false (doesn't contain digit)
         System.out.println(isValidPassword("Very strong!")); // false (contains space)
     }
 }

