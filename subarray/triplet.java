class triplet{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7,8,12};
        int count=0;
        int n=arr.length;
        for(int i=n-1;i>=2;i--){
            int l=0;
            int r=i-1;
            while(l<r){
                if(arr[l]+arr[r]==arr[i]){
                 // for debugging    System.out.println(arr[l]+" "+arr[r]);
                    count++;
                    l++;
                    r--;
                }
                else if(arr[l]+arr[r]<arr[i])
                  l++;
                else
                r--;
            }


          
        }
        System.out.println(count);

    }
}