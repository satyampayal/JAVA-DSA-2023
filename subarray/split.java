public class split {
    // arr={1,2,3,4,5,5}=> {1 2 3 4} and {5 5} sum are equal
    static void splitfun(int arr[]) {
        int k = 1, sum1 = 0, sum2 = 0;
        while (k < arr.length) {
            for (int i = 0; i < k; i++)
                sum1 += arr[i];

            for (int i = k; i < arr.length; i++)
                sum2 += arr[i];
            if (sum1 == sum2) {
                System.out.print(sum1 + "from index 0 to"+(k-1)+" and "+(k)+"to "+(arr.length -1));
                break;

            } else{
                k++;
                sum1 = 0;
                sum2 = 0;

            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 5 };
        splitfun(arr);
    }
}
