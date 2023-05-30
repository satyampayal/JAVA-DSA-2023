public class moveallZERO {
    public static void main(String[] args) {
        int arr[] = { 0, 3, 3, 0, 5, 6, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                    }

                }
            }
        }

        //
        // int arr2[]={2,0,3,0,8,0,3};
        // int c=0;
        // for(int i=0;i<arr2.length;i++){
        // if(arr2[i]==0)
        //// c++;
        //// else{
        //// if(c>0){
        //// arr2[i-c]=arr2[i];
        //// arr2[i]=0;
        //// }
        //// }
        //// }

        //// for(int i=0;i<arr.length;i++)
        //// System.out.print(arr2[i]+" ");
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
