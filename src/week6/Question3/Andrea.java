package week6.Question3;

public class Andrea {
    public static void main(String[] args) {
        System.out.println(sumOfDigitsInString("A3v15"));
    }

    public static int sumOfDigitsInString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                String c = ch + "";
                sum += Integer.parseInt(c);
            }
        }
        return sum;
    }
}
    /*
    Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */