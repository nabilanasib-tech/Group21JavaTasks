package week01.question01;

/*  1. Numbers -- even or odd
       Write a method which can identify whether a given number is even or odd.
 */
public class Andrea {
    public static void main(String[] args) {
        evenOrOdd(5);
        evenOrOdd(6);
        System.out.println(isEven(23));
        System.out.println(isEven(88));
        //
    }

    public static void evenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    //simpler answer
    public static boolean isEven(int n) {
        return n%2==0;
    }
}