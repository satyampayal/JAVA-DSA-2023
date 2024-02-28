package interviewPW;

public class frogJump {
    public static void main(String[] args) {
        int[] arr={4,0,0,0,0,7};
        int sIndex=0;
        int end=arr.length-1;
        int steps=0;

        while(sIndex<end){
            if(arr[sIndex]==0)
              { sIndex-=1;
                if(sIndex<0)
                  break;
              //  return ;
              }
              else{
                sIndex+=arr[sIndex];
                if(sIndex>end){
                    steps+=1;
                   // return;
                }
                else 
                  steps+=1;
              }

        }
        if(steps==0)
          System.out.println("Jump not posiible");
        else
         System.out.println("No.Of jump are"+steps);
    }
}
