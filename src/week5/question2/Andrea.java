package week5.question2;

public class Andrea {
    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));
        System.out.println(reverseString("rat"));
    }

    public static String reverseString (String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
 /*
    Write a return method that can reverse a String
    Ex: Reverse("ABCD"); ==> DCBA
     */