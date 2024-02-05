package week02.question1;

public class Darus {
    /*
    Ask further questions to interviewer to make sure my approach is in an acceptable format desired for answer. Explain how there are several ways to
    solve. Using addition/subtraction, multiplication/division, a ^ operator.

    If you have a situation where you need to swap integers without using a temp variable  during an interview,
     there's another way using the ^ (XOR pronounced, i think, ZOR but spelled like X O R) or  called caret pronounced /ˈkærət/ .
      For instance say int x = 5 (in binary 0101);  and int y = 10 (in binary 1010); using ^ operator
      to solve breaks down to this x = x^ y; (//15 --> 1111 in binary) then y = x ^ y;(// 10 --> 1010)
      then x = x ^ y; (// 5 --> 0101)  after that it will result in x = 10; and y = 5;
      Like usually it's a real basic question to swap intergers with addition then subtraction or multiplication then division.
      But this way is a good way to show the interviewer your expertise in java and shows off some understanding of use of binary
      that most others wouldn't even use to solve the task, and somewhat easy to memorize.
but it's just x = x^ y;
y= x ^y;
x = x^y;
Thats it
     */
    public static void swapUsingMultiplyDivide(int x, int y) {
        x = x * y;
        y = x / y;
        x = x / y;

        System.out.println("After swap: x = " + x + " and y = " + y);
    }

    public static void swapUsingAddSubtract(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swap: x = " + x + " and y = " + y);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("Before method call: x = " + x + " and y = " + y);
        swapTwoIntegersValues(x, y);
    }

    public static void swapTwoIntegersValues(int x, int y) {
        System.out.println("Inside method: Before swap - x = " + x + " and y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " and y = " + y);
    }



}
