package week9.Question1;

import java.util.Arrays;

public class Andrea {
/*
    1 - Array_concat2Arrays -
    Write a return method that can concatenate two arrays
*/
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(concatTwoArrays(arr1, arr2)));
    }

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : arr1) {
            result[pos] = element;
            pos++;
        }

        for (int element : arr2) {
            result[pos] = element;
            pos++;
        }

        return result;
    }
}



/*
In the above program, instead of using arraycopy, we manually copy each element of both arrays array1 and array2 to result.
We store the total length required for result, i.e. array1.length + array2. length. Then, we create a new array result of the length.
Now, we use the for-each loop to iterate through each element of array1 and store it in the result. After assigning it, we increase the position pos by 1, pos++.
Likewise, we do the same for array2 and store each element in result starting from the position after array1.
 */