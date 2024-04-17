package week1.question01;

public class Nabila {

        public static void main(String[] args) {

            oddOrEven(60);
            System.out.println(isEvenNumber(55));
            System.out.println(isEvenOrOdd(12));

        }

        // method 1
        public static void oddOrEven (int n){

            if(n % 2 == 0){
                System.out.println(n + " is even");
            }else {
                System.out.println(n + " is odd");
            }

        }
        // method 2
        public static boolean isEvenNumber (int num) {

            return num % 2 == 0;

        }
        // method 3
        public static String isEvenOrOdd (int n){

            if(n % 2 == 0){
                return "even";
            }else {
                return "odd";
            }

        }

    }

/*
1. Numbers -- odd & even
Write a method which can identifies given number is even or odd

EX:
  identify(5) -> "Odd"
  identify(6) -> "Even"
 */


