package week3.question1_primeNumber;

public class Leena {
    /*

    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not

     */
    public static void main(String[] args) {
        isPrime(4);

    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    }


