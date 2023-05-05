import java.util.Scanner;

public class Assig2 {
    public static void main(String[] args) {
    // Armstring number check
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
 
    for(int x=153;x<=n;x++){
        int temp=x,check=x;
        int c=0,digit;
        while(temp!=0){
            temp/=10;
            c++;
        }
        temp=x;
        int sum=0,pro;
        while(temp!=0){
            digit=temp%10;
             pro=1;
            for(int i=1;i<=c;i++){
                pro=pro* digit;
    
            }
            sum+=pro;
    
            
            temp/=10;
        }
        if(sum==check)
        System.out.print(sum+" ");
        
    }
    sc.close();
    System.out.println();
    // pattren 
    int z=4;
    for(int i=1;i<=4;i++){
        for(int j=1;j<=z-i;j++)
        System.out.print(" ");
        for(int j=1;j<=i;j++)
         System.out.print("* ");

         System.out.println();
    }
    for(int i=1;i<=3;i++){
        for(int j=1;j<=i;j++)
        System.out.print(" ");
        for(int j=1;j<=z-i;j++)
         System.out.print("* ");

         System.out.println();
    }


    
    


        
    }
}
