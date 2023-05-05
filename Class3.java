import java.util.*;
public class Class3 {
    public static void main(String[] args) {
        //highest prime fractor
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=1;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=0;
                break;
            }
            else{
            flag=1;
        }
            
        }
        if(flag==1)
        System.out.println("yes its prime ");
        else
        System.out.println("Not prime");
        sc.close();

    }
}
