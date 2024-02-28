import java.util.Scanner;
public class Fibonacii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int first=0;
        int second=1;
        int third;
        for(int i=0;i<n;i++){

            if(i==n-1){
                
                    System.out.println(first);
            }
            third=first+second;
            first=second;
            second=third;
        }
        sc.close();
    }

}
