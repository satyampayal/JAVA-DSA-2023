public class max_min_soON {
    public static void main(String[] args) {
        int i, j, temp, c = 0;
        int arr[] = { 1, 2, 3, 4, 5 ,6, 7};
        int max = Integer.MIN_VALUE, min = Integer.MIN_VALUE;
        int n = arr.length;
        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (j = i ; j < n; j++) {
                    if (arr[j] > max) {
                        max = arr[i];
                        c = j;
                    }
                }
                max=Integer.MIN_VALUE;
                temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
                System.out.println("Max is "+arr[i]);

            }

            else {
                for (j = i; j < n; j++) {
                    if (arr[j] < min) {
                        min = arr[i];
                        c = j;
                    }
                }
                min=Integer.MIN_VALUE;
                temp = arr[i];
                arr[i] = arr[c];
                arr[c] = temp;
                System.out.println("Min is "+arr[i]);


            }

        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
