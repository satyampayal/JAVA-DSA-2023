public class sureToSwap {
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,0};
        int size=arr.length;
        int l=0,h=size-1;
        while(l<=h){
            if(arr[l]==0)
               l++;
            else{
                int temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
                h--;
            }
        }
        for(int i=0;i<size;i++)
         System.out.print(arr[i]+" ");
    }
}
