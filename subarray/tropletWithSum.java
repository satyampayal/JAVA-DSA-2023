import java.util.*;

public class tropletWithSum {
    public static void main(String[] args) {
        int arr[] = { 1,4,45,6,10,8 };
        Arrays.sort(arr);
        int count = 0;
        int x=13;
        int n = arr.length;
        for (int i = n - 1; i >= 2; i--) {
            int l = 0;
            int r = i - 1;
            while (l < r) {
                if (arr[l] + arr[r] + arr[i]==x) {
                     System.out.println(arr[l]+" "+arr[r]+" "+ arr[i]);
                    count++;
                    l++;
                    r--;
                } else if (arr[l] + arr[r] + arr[i]<x)
                    l++;
                else
                    r--;
            }

        }
        System.out.println(count);

    }

}
