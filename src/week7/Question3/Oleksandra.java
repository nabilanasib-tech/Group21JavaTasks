package week7.Question3;

public class Oleksandra {
    /*
        - Sort Descending -
        Write a return method that can sort an int array in descending order
         without using the sort method of the Arrays class
            Ex: int[] arr = {10, 20 , 7, 8, 90};
                      arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */
    public static void main(String[] args) {
        // Create an array with unsorted integers
        int[] arr = {10, 20, 7, 8, 90};
        // Call the Sort() method with the array as an argument and reassign the result to the 'arr' variable
        arr = Sort(arr);
        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Here's the Sort() method provided in the previous response, with the description
    private static int[] Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

