package week6.Question3;

public class Batdorj {

    public static void main(String[] args) {

        String input = "A3v15";
        int sum = sumDigits(input);
        System.out.println ("Find sum of digits from ->"+ input+ "-> 3+1+5 = "+sum );

    }
    public static int sumDigits(String s){
        int sum = 0;

        //iterate through each character in the input string using a for-each loop
        for(char c : s.toCharArray ()){

            //checking if it is a digit using Character.isDigit(c)
            if(Character.isDigit (c)){

                // Converting the digit character to an integer and add it to the sum
                sum += Character.getNumericValue (c);
            }
        }
        return sum;

    }
    /*
    Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */

}
