package week04.question1;

public class Andrea {

    public static void main(String[] args) {

        String str = "AAABBCDD";
        int[] freq = new int[str.length()];
        System.out.println("Str: " + str);

        //Convert the given string into character array
        char str1[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str1[i] == str1[j]) {
                    freq[i]++;

                    //Set str1[j] to 0 to avoid printing visited character
                    str1[j] = '0';
                }
            }
        }
        //Displays the characters and their corresponding frequency
        for (int i = 0; i < freq.length; i++) {
            if (str1[i] != ' ' && str1[i] != '0')
                System.out.print(str1[i] +""+ freq[i]);
        }
    }
}

/*
String - Frequency of Characters

Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
