
class Assi1{
    public static void reverse(int x){
        int temp=x,digit,rev=0;
        while(temp!=0){
            digit =temp%10;
            rev =rev*10 + digit;
            temp/=10;

        }
        System.out.println("reverse of "+x+" is "+rev);
    }
    public static void armstrong(int x){
        int temp=x,c=0;
        while(temp!=0){
            temp/=10;
            c++;
        }
        temp=x;
        while(temp!=0){
            Math.pow(temp, c);
        }
    }
    public static void main(String sss[]) {
        // reverse number 
        int x=1234;
        reverse(x);
        //armstrong number (173)=1^3 + 7^3 + 3^3==
        x=1000;
        armstrong(x);

        /*  pateren 
        1
        12
        123
        1234
        */
        System.out.println();
        System.out.println();
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(j%2!=0)
                   System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }


        
        System.out.println();
        System.out.println();
        for(int i=1;i<=5;i++){
            for(int j=6-i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println();
        int k=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

        
        System.out.println();
        System.out.println();
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((j+i)%2==0)
                System.out.print("1 ");
                else
                System.out.print("0 ");
            }
            System.out.println();

        }
       
        System.out.println();
        System.out.println();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1||i==5 || j==1||j==5)//my logic   complexity does'nt depend upon multiple operation okk...
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
// another logic of sir and it is only for readablity cause 
        System.out.println();
        System.out.println();
        for(int i=1;i<=5;i++){
         if(i==1||i==5 ){
            for(int j=1;j<=5;j++)
               System.out.print("*");
         }
         else{
            System.out.print("*");
            
            for(int j=2;j<=4;j++)
               System.out.print(" ");
            
            System.out.print("*");

         }
         System.out.println();
        }

    } 
    
    
}