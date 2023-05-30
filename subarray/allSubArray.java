public class allSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n=arr.length;
        int i,j,k;
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                for(k=i;k<=j;k++)
                 System.out.print(arr[k]+" ");
           System.out.println();

            }
        }
    }
}
