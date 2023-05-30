package tapAcdmy;

public class getFloorandCeil {
    public static void main(String[] args) {
        int arr[] = { 19, 23, 56, 61, 72, 88, 92 };
        int n = arr.length;
        int x = 0;
        int floorofY = Integer.MIN_VALUE;
        int ceilofX = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= x) {
                ceilofX = arr[i];
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] <= x) {
                floorofY = arr[i];

            }
        }

        if (floorofY == Integer.MIN_VALUE) {
            System.out.println("Does Not Exist");
        } else
            System.out.println("floor is " + floorofY);

        if (ceilofX == Integer.MIN_VALUE) {
            System.out.println("Does Not Exist");
        } else
            System.out.println("Ceil is " + ceilofX);



 // BY BINARY SEARCH
        int arr2[] = { 19, 23, 56, 61, 72, 88 };

        n = arr2.length;
        int key = 68;
        floorofY = Integer.MIN_VALUE;
        ceilofX = Integer.MIN_VALUE;
        int l = 0;
        int h = n - 1;

        while (l <= h) {
            int mid = (l + h) / 2;
            if(key==arr2[mid])
        }
    }

}
