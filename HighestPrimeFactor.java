class HighestPrimeFactor{
     public static void main(String[] args) {
        int k=0,flag=0,n=6;
        int hpf=2;
        int arr[]=new int[100];
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=1;
                }
            }
            if(flag==0){
                arr[k]=i;
                k+=1;
            }
           
         
        }
        for(int i=0;i<=k;i++){
                
          System.out.println(arr[i]);
          if(n%arr[i]==0){// this show / by zero nor divisble but arr[]={2,3}
            hpf=i;
        }
        }
     
        System.out.println("Highest prime factor is :"+hpf);
        

    }
}