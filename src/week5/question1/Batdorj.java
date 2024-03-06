package week5.question1;

public class Batdorj {

    /**
     * Write a return  method that can find the unique characters from the String
     *     Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        String uniqueChar = findUniqueCharacters (str);

        if(!uniqueChar.isEmpty ()){
            System.out.println ("Unique characters: "+uniqueChar );
        }else {
            System.out.println ("There is not such Unique characters!!" );
        }

    }
    public static String findUniqueCharacters(String input){

        int[]count = new int [20];
        // creating char array it is tracking the frequency of characters

        for(char unique : input.toCharArray ()){
            count[unique - 'A']++;
        }
        // Creating the result string with unique characters
        StringBuilder result = new StringBuilder ();
        for(char unique1 : input.toCharArray ()){
            if(count[unique1 - 'A'] == 1){
                result.append (unique1);
            }
        }
        return result.toString ();
    }
}
