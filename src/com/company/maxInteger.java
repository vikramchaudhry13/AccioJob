package com.company;
import java.util.* ;
import java.io.* ;
public class maxInteger {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int max=Math.max(a,Math.max(b,c));
        System.out.println(max);
    }
}
