package week7.Question2;

public class Oleksandra {
    /*
     - Sort Ascending -
     Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
         Ex: int[] arr = {10, 9, 8, 7};
         arr = Sort(arr); ==>{ 7, 8, 9, 10};
*/
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = sort(arr);
        System.out.print("Sorted array in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

