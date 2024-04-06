package week5.question2;

public class Abdellah {

    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
    }

    public static String reverseString(String str){

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            char each = str.charAt(i);
            reverse += each;
        }
        return reverse;
    }
}
/*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */
