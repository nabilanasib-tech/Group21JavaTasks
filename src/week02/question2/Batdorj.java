package week02.question2;

public class Batdorj {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println (i + " is divisible by 15" );
            }
            if (i % 5 == 0) {
                System.out.println (i + " is divisible by 5" );
            }
            if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
            }
        }

        // solution #2
        System.out.print("Divisible by 15 = ");
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print(i+", ");
            }
        }
        System.out.println ( );
        System.out.print("Divisible by 5 = ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 15 != 0) {
                System.out.print(i+", ");
            }
        }
        System.out.println ( );
        System.out.print("Divisible by 3 = ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                System.out.print(i+ ", ");
            }
        }
        System.out.println ( );
    }
}
