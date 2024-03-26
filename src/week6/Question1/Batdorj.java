package week6.Question1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Batdorj {

    public static boolean isValidPassword(String password) {
//The isValidPassword method checks if the given password meets the following criteria
        //Contains at least 8 characters and at most 20 characters.
        //Contains at least one digit.
        //Contains at least one uppercase letter.
        //Contains at least one lowercase letter.
        //Contains at least one special character (such as @, #, $, %, ^, &, +, or =).
        //Does not contain any white spaces.
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,20}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String password1 = "SecureP@ssw0rd";  // Valid password
        String password2 = "Weak123";        // Invalid password

        System.out.println(isValidPassword(password1));  // Output: true
        System.out.println(isValidPassword(password2));  // Output: false
    }
}
    
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
    
    

