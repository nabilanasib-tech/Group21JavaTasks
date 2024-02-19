package week3.question1_primeNumber;

public class Oleksandra {

    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }
        //Check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                //if number is divisible by any i , it's not prime
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        //Example

        int numberToCheck = 17;
        if(isPrime(numberToCheck)){
            System.out.println(numberToCheck + " is a prime number.");
        }else{
            System.out.println(numberToCheck + " is not a prime number.");
        }

    }


}
  /*

    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not

     */
