package week2.question3;

public class Batdorj {

    public static void main(String[] args) {
        printNumbers(24);
    }
    public static void printNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 5 == 0) {
                result += "Coders";
            }

            if (result.equals("")) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}
