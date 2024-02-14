package week02.question1;

public class Andrea {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        a = a + b; //30
        b = a - b; //10
        a = a - b; //20

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("---------------------");

        //using temp variable

        int x = 10, y = 20;

        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
