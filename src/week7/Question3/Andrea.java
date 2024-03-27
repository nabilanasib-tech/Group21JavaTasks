package week7.Question3;

public class Andrea {
/*
        - Sort Descending -
        Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
            Ex: int[] arr = {10, 20 , 7, 8, 90};
                      arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */

    public static void main(String[] args) {
        //Initialize array
        int[] arr = {10, 20, 7, 8, 90};
        int temp;

        //Displaying elements of original array
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sort the array in descending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
