package week7.Q2_SortAscending;

public class Batdorj {

    //To sort an integer array in ascending order without using the Arrays.sort() method, we can implement a simple sorting algorithm such as Bubble Sort. Here’s a Java method that achieves this:
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        sortAscending(arr);
        printArray(arr); // Print the sorted array
    }

    public static void sortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/*
The sortAscending method uses the Bubble Sort algorithm to sort the array in ascending order.
The printArray method is used to display the sorted array.
 */

/*

===>   alternative approach to sort an integer array in ascending order without using the Arrays.sort() method. We’ll use the Selection Sort algorithm:

public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        sortAscending(arr);
        printArray(arr); // Print the sorted array
    }

    public static void sortAscending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
 */