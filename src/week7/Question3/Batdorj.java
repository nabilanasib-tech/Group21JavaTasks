package week7.Question3;

public class Batdorj {

    public static void main(String[] args) {
        int[] arr = {10, 20, 7, 8, 90};
        sortDescending(arr);
        printArray(arr); // Print the sorted array
    }

    public static void sortDescending(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            // Find the maximum element in the remaining unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the first element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
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