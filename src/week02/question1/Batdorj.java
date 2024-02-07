package week02.question1;

public class Batdorj {

    public static void main(String[] args) {

        int x = 4,
                y = 10;

        //using arithmetic operations to swap the values
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println ("X = "+ x );
        System.out.println ("Y = "+ y );
    }
}
