package week01.question01;

import java.util.stream.IntStream;

public class Batdorj {

    public static void main(String[] args) {

        int number = 153;
        boolean isEven = number % 2 == 0;
        if(isEven){
            System.out.println (number+" is even number" );
        }
        if(!isEven){
            System.out.println (number+" is odd number" );
        }

    }

    //solution1
    public static boolean isEvenNumber(int num){
        return num%2==0;
    }
    //solution2
    public static String isEvenOrOdd(int num){
        if(num % 2 == 0 ){
            return "Even";
        }else {
            return "Odd";
        }
    }

    public static void oddOrEven(int number){
        //solution3
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }


        //solution4
        IntStream.rangeClosed(1, 8).forEach(num ->{
            if (num % 2 == 0) {
                System.out.println(num+" is even number");
            } else {
                System.out.println(num+" is odd number");
            }
        });

    }

}
