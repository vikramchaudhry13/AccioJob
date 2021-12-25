package com.company;
import java.util.* ;
import java.io.* ;
public class bigLight2 {
    public static void main(String[] args) {
        long h1,h2,v1,v2;
        Scanner sc=new Scanner(System.in);
        h1=sc.nextLong();
        h2=sc.nextLong();
        v1=sc.nextLong();
        v2=sc.nextLong();
        long numerator=(h1-h2);
        long denominator=(v2-v1);
        if(denominator!=0){
            if(numerator%denominator==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
    }
}
