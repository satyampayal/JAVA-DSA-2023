package interviewPW;

public class toh {
    public static int moves(int n,char s,char d,char a){
        // base condition
        if(n==1 )
         return 1;
        int step1=moves(n-1,s,a,d);
        int step2=1;
        int step3=moves(n-1,a,d,s);
        return step1+step2+step3;

    }
    public static void main(String[] args) {
        int n=2;
       System.out.println( moves(n,'s','d','a'));
    }
}
