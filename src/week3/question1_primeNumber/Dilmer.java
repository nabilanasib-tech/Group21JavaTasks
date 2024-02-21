package week3.question1_primeNumber;

public class Dilmer {

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(6));
        System.out.println(isPrime(8));
        System.out.println(isPrime(11));
        System.out.println(isPrime(13));
    }

    public static boolean isPrime (int n){

        /*
            if(n < 2){
            return false;
            }
         */

        for(int i = 2; i < n; i++){

            if(n % i == 0){ // if the number is evenly divisible by i (2,3,4,5,etc.) then it's not prime
                return false;
            }
        }

        return true;
    }
}

  /*

    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not
    -> A number is prime if it is only divisible by one and itself

     */
