
//Since your array is sorted, you can simply do it as follows:

import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // Store the last element to 'temp'
                temp = arr[arr.length - 1];
                // Shift all elements, starting from index, 'i', to one place right
                for (int j = arr.length - 2; j >= i; j--) {
                    arr[j + 1] = arr[j];
                }
                // Put the value stored in 'temp' to index, 'i'
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
