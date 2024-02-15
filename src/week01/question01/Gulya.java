package week01.question01;

public class Gulya {

    public static void main(String[] args) {

        oddOrEven(60);
        System.out.println(isEvenNumber(55));
        System.out.println(isEvenOrOdd(12));
    }

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

/** before you work in your branch, first update "master",
 after master is updated you have to be in your branch(Gulya) then
 you merge master into Gulya.
 * after you work in your branch, and you are about to commit,
 you must update master again and merge into Gulya's branch after everything
 is updated you select the changes add a comment and commit then you push.
 * after pushing you must go to GitHub and create a pull request and must add
 anyone to review your changes and approved your request once they approved it then either
 you or the person reviewing must merge into master.*/