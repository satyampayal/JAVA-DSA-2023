package Restart_JAVA;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class SlaerySlip {
    static void  saleryFormat(int sal,Locale l){
        NumberFormat nf= NumberFormat.getCurrencyInstance(l);// okh NumberFormat is an Abstarct class 
        String temp=nf.format(sal);
        System.out.println("This is formated sal: "+temp);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Chose Your language");
        System.out.println("Enter 1 For Hindi  \nEnter 2 for English \nEnter 3 for French");

        int langChoice=sc.nextInt();
        Locale locale;
        if(langChoice==1){
            locale= Locale.of("hi","IN");
        } else if(langChoice==2){
            locale= Locale.of("en","US");
        } else if(langChoice==3){
            locale= Locale.of("fr","FR");
        }
        else{
            System.out.println("Wrong Choice ,new using English default");
            locale= Locale.of("en","US");
        }
        System.out.println("Enter your sallery");
        int sallery=sc.nextInt();
        saleryFormat(sallery, locale);
        sc.close();

    }
}
