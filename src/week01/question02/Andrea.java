package week01.question02;

/* 2. Numbers -- Divide without / operator
      Write a method that can divide two numbers without using division operator
*/
public class Andrea {
    public static void main(String[] args) {

       // System.out.println(Math.divideExact(10, 2)); // 5
        System.out.println(Divide(20, 2));
    }

    public static int Divide(int a, int b) {

        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        return count;
    }
}


