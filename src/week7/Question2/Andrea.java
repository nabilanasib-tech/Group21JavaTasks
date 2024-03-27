package week7.Question2;

public class Andrea {
/*
     - Sort Ascending -
     Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
         Ex: int[] arr = {10, 9, 8, 7};
         arr = Sort(arr); ==>{ 7, 8, 9, 10};
*/
  public static void main(String[] args){
        //creating an instance of an array
        int[] arr = new int[] {10, 9, 8, 7};
        System.out.println("Array elements after sorting:");
        //sorting logic
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                int temp;
                    if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    }
                }
            //prints the sorted element of the array
                System.out.println(arr[i]);
        }
    }
}
