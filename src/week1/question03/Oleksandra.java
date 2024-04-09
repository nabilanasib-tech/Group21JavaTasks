package week1.question03;

public class Oleksandra {

    // Method 1.
    public static void PrintFinRaNumbers(){
        for(int i = 1; i <= 30; i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("fin,ra ");
            }else if ( i % 3 == 0){
                System.out.println("fin ");
            }else if ( i % 5 == 0){
                System.out.println("ra ");
            }else{
                System.out.println(i + " ");
            }
        }


    }

    // Method 2.

  public static void printFinRaNumbers(){
        for(int i = 1; i <= 30; i++){
            String output = (i % 3 == 0 && i % 5 == 0)?"fin,ra ":(i % 3 == 0) ? "fin "
                                                                :(i % 5 == 0) ? "ra "
                                                                : i + " ";
            System.out.println(output);
        }
  }

    public static void main(String[] args) {
        PrintFinRaNumbers();
        printFinRaNumbers();

    }
}
