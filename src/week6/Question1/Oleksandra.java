package week6.Question1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Oleksandra {
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
     public static boolean validatePassword(String password) {
         // Check length and space
         if (password.length() < 6 || password.contains(" ")) {
             return false;
         }

         // Check for uppercase letter
         if (!containsUpperCase(password)) {
             return false;
         }

         // Check for lowercase letter
         if (!containsLowerCase(password)) {
             return false;
         }

         // Check for special characters
         if (!containsSpecialCharacter(password)) {
             return false;
         }

         // Check for digit
         if (!containsDigit(password)) {
             return false;
         }

         return true;
     }

    private static boolean containsUpperCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsLowerCase(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialCharacter(String password) {
        Pattern pattern = Pattern.compile("[!@#$%^&*()\\-_=+{};:,<.>/?]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    private static boolean containsDigit(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String password = "Passw0rd!";
        if (validatePassword(password)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is not valid");
        }
    }

    }
  //  This method validatePassword()
//  which takes a password as input and returns true if it meets all the requirements,
//  otherwise returns false. It also contains helper methods to check for uppercase,
//  lowercase, special characters, and digits in the password.
//  The main() method demonstrates an example usage of the validatePassword() method.


