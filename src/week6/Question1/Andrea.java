package week6.Question1;

public class Andrea {
    public static void main(String[] args) {
        System.out.println(passwordValidation("Cydeo123!"));
    }

    public static boolean passwordValidation(String password){

        boolean hasAtLeast6Chars = password.length() >= 6;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }
        boolean isStrongPassword = hasAtLeast6Chars && hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;

        return isStrongPassword;
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


