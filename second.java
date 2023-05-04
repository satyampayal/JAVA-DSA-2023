
class second{
    public static int sum(int data){
        int digit,sum=0;
        while(data!=0){
            digit=data%10;
            sum=sum+digit;
            data=data/10;
        }
        return sum;
    }
    public static void main(String args[]){
       System.out.println(sum(1234));
       
        
        }
    }
