public class maxSumSubArray {
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int max = arr[0];
        int curr_sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            if (curr_sum + x >= x){
                curr_sum += x;
             //   System.out.println("for 1 loop curr_sum "+curr_sum); for debugging
            }
            else{
                curr_sum = x;
              //  System.out.println("for 2 else currSum "+curr_sum);  for debugging
            }

            if (curr_sum > max){
                max = curr_sum;
            //   System.out.println("for 3 if max "+max);   for debugging

            }
        }
        System.out.println(max);
    }
}
