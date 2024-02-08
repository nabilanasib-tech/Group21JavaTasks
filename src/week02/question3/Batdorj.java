package week02.question3;

import java.sql.SQLOutput;

public class Batdorj {

    public static void main(String[] args) {
        Pnumbers (24);
    }

    public static void Pnumbers(int N){

        for (int i = 1; i <= N; i++) {
            String result = "";

            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "test";
            }
            if (i % 5 == 0) {
                result += "Coders";
            }
            if(result.equals ("")){
                System.out.println (i );
            }else{
                System.out.println (result );
            }
        }

    }
}
