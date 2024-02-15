package week3.question1_primeNumber;
/*
    Numbers -- PrimeNumber
    Write a method that can check if a number is prime or not
*/
public class Andrea {
    public static void main(String[] args) {

        System.out.println(isPrime(11));
        System.out.println(isPrime(20));
        System.out.println(isPrime(13));

    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
