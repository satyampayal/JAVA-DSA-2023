package dsaTest;


public class evenPlaceNm {
    //num=45678 ; return evenPlaces Digit value => 57;
    public static void main(String[] args) {
        int num=10302;
        int rev=0;
        int temp=num;
        int size=0,digit;
        while(temp>0){
            digit=temp%10;
          temp/=10;
          System.out.println(temp);
          size++;
          rev=rev*10 +digit;


        }
        System.out.println(rev);

        while(rev>0){
            digit=rev%10;
            if(size%2!=0)
              System.out.print(digit+" ");
            rev/=10;
            size--;
        }
    }
}
