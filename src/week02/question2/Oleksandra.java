package week02.question2;

public class Oleksandra {

    public static void main(String[] args) {

        // Method 1

        System.out.print("Divisible by 15: ");
        for (int i = 1; i <= 100; i++){
            if (i % 15 == 0 ) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
        System.out.print("Divisible by 5: ");
        for (int i = 1; i <= 100; i++){
            if (i % 5 == 0 ) {
                System.out.print(i + " ");
            }

        }
        System.out.print("\n");
        System.out.print("Divisible by 3: ");
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 ) {
                System.out.print(i + " ");
            }
        }


    }
}
   /*
    Numbers -- Divisible by 3, 5, 15

     Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
     if the number can be divisible by 3, 5 and 15, then it should only be displayed in Divisible By15' section
     if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in Divisible By3' section
     if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in Divisible By5' section

    */