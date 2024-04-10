package week1.question02;

public class Nabila {

    public static void main(String[] args) {
        divide(6, 2);
        divide(7, 3);
    }

    public static void divide(int n1, int n2) {

        int count = 0;
        String result = n1 + " / " + n2 + " is ";


        while (n1 >= n2) {
            count++;
            n1 -= n2;
        }

        // Each time n2 is being subtracted from n1, it will count and re-loop.
        // Example: 6 - 2 = 4 -> 4 - 2 = 2 ->  2 - 2 = 0. Count = 3.

        System.out.println(result + count + " with remainder " + n1);

    }

}





/*
2. Numbers - - Divide without / operator
Write a method that can divide two numbers without using division operator

    public static void divide (int n1, int n2){ // 6, 2 -> 4 -> 2 -> 0. counter subtracted 3 times so = 3

        int count = 0; // how many times does n2 go into n1
        String result = n1 + " / " + n2 + " is ";

        // using a while loop bc we don't know yet exactly how many times n2 goes into n1

        while(n1 >= n2){ // first number has to be greater than or equal to second number
            count++;
            n1 -= n2; // subtract n2 each time until left with a remainder. counter will count how many times it subtracted.
        }

        System.out.println(result + count + " with remainder " + n1);


    }
 */
