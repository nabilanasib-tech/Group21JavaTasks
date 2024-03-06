package week5.question2;

public class Batdorj {

    /**
     * Write a return method that can reverse  String
     *     Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {

        String input = "ABCD";
        String reversed = reversStringUsingCharArray (input);
        // This method calls it and assigns to value of reversed.
        System.out.println ("Reversed string using char array: "+reversed);
    }
    public static String reversStringUsingCharArray(String input){

        char[] arr = input.toCharArray ();
        // It converts the input string
        int first = 0;
        int end = arr.length - 1;
        // Initializes two integer variables
        while (first < end){
            char cont = arr[first];
            arr[first] = arr[end];
            arr[end] = cont;
            // swapping the characters at index first and end in the charArray.
            first++; // increments the first
            end--; // decrements the last
        }
        return new String (arr);
        // constructs a new String from the modified charArray and returns it.
    }
}
