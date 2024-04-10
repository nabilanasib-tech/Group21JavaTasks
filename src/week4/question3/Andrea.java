package week4.question3;
import java.util.Arrays;

public class Andrea {
    public static void main(String[] args) {
        char str[] = "AAABBBCCC".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicates(str, n));
    }
    static String removeDuplicates(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;

        // Loop through all characters
        for (int i = 0; i < n; i++)
        {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }

            // If not present, then add it to result
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
}

/*
 String - Remove Duplicates

Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */