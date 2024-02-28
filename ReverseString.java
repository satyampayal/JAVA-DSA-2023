public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sc=new StringBuilder("t");

       for(int i=0;i<sc.length()/2;i++){
        char frontChar=sc.charAt(i);
        char backChar=sc.charAt(sc.length()-i-1);
        if(i<sc.length()/2){
            sc.setCharAt(i, backChar);
            sc.setCharAt(sc.length()-1-i, frontChar);
        }
       }
       System.out.println(sc);
    }
}
