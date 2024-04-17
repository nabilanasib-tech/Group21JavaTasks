package week7.Question1;

public class Oleksandra {
    /*
    - Find Minimum -
    Write a method that can find the minimum number from an int Array
        Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
     */
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int min = findMinimum(arr);
        System.out.println("The minimum number in the array is: " + min);
    }

    public static int findMinimum(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
