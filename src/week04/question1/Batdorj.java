package week04.question1;

public class Batdorj {

    public static void main(String[] args) {

        //Write a return method that can find the frequency of characters
        //  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        String input = "AAABBCDD";
        String result = findCharacterFrequencies(input);
        System.out.println("Character frequencies: " + result);

    }
    public static String findCharacterFrequencies(String str) {
        int[] frequencyArray = new int[26]; // Assuming only uppercase letters

        for (char c : str.toCharArray ( )) {
            if (Character.isUpperCase (c)) {
                int index = c - 'A';
                frequencyArray[index]++;
            }
        }

        StringBuilder result = new StringBuilder ( );
        for (char c = 'A'; c <= 'Z'; c++) {
            int count = frequencyArray[c - 'A'];
            if (count > 0) {
                result.append (c).append (count);
            }
        }

        return result.toString ( );
    }

}
