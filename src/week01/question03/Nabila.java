package week01.question03;

public class Nabila {

    public static void main(String[] args) {

        for(int i = 1; i <= 30; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            }else if( i % 3 == 0){
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            }else{
                System.out.println(i);
            }
        }


    }



}
/*
3. FINRA :
Write a method which prints out the numbers from 1 to 30, but print "FIN" instead of numbers for multiples of 3, "RA" instead of numbers for numbers that are multiples of 5, and a multiple of both 3 and 5 for "FINRA" instead of the number.
 */
