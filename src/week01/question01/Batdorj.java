package week01.question01;

public class Batdorj {

    public static void main(String[] args) {




    }

    public static boolean isEvenNumber(int num){
        return num%2==0;
    }

    public static String isEvenOrOdd(int num){
        if(num % 2 == 0 ){
            return "Even";
        }else {
            return "Odd";
        }
    }

    public static void oddOrEven(int number){

        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }
}
