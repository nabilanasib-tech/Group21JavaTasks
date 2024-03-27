package week7.Question1;

public class Andrea {
    /*
    - Find Minimum -
    Write a method that can find the minimum number from an int Array
        Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static void main(String[] args) {

        minNumInIntArray();
    }
    public static void minNumInIntArray(){
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The minimum number is: " + min);
    }


}
