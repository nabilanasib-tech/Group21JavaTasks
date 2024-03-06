package week5.question2;

public class Nabila {

    public static void main(String[] args) {

        String reverse = "ABCD";
        System.out.println(reverseString(reverse));



    }

    public static String reverseString(String str){

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--){//  i: index number of the given string starting from last index to index 0
            reverse += str.charAt(i);
        }

        return reverse;

    }

}
  /*
    Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA
     */
