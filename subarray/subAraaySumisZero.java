class subAraaySumisZero{
    // int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
    // sum of subarray is zero give index

    // function
    static int  find_subAraay(int []arr,int n){
        int out[];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0)
                   out
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        int n=arr.length;
        find_subAraay(arr,n);
    }
}