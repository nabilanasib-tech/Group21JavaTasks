package week02.question1;

public class Batdorj {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
            }
            if (i % 5 == 0) {
                System.out.println(i + " is divisible by 5");
            }
            if (i % 15 == 0) {
                System.out.println(i + " is divisible by 15");
            }
        }



    }
}
