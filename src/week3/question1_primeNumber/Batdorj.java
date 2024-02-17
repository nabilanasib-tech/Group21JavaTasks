package week3.question1_primeNumber;

public class Batdorj {

    public static void main(String[] args) {

        int num = 29;
        boolean isPrime = isPrime(num);
        System.out.println (num+" is a prime number? "+ isPrime );

    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2;i * i <= num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
