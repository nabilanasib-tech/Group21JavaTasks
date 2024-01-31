package week01.question01;

public class Oleksandra {
    public static void main(String[] args) {
        OddOrEven(50);
        System.out.println(isEvenNum(60));
        System.out.println(isEven(50));

    }
    //Method 1
public static void OddOrEven(int num){


        if(num % 2 == 0){
            System.out.println(num + " is even.");
        }else {
            System.out.println(num + " is odd.");
        }
}
// Method 2
    public static boolean isEvenNum(int num){
        return num % 2 == 0;
    }
 // Method 3
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}

