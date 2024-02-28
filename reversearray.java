public class reversearray {
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
         int s=0,e=arr.length -1;
         while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
         }
         for(int i=0;i<arr.length;i++)
         System.out.print(arr[i]+ " ");
         System.out.println();

         // min max 

         int min=arr[0],max=arr[0];
         for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
               max=arr[i];
         }
         
         for(int i=0;i<arr.length;i++){
            if(min>arr[i])
               min=arr[i];
         }
         System.out.println("max is :"+max+" and " +"Minimum is :"+ min);


         // peak element 
         for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
               System.out.print(arr[i]+" ");
         }

         
         
    }
}
