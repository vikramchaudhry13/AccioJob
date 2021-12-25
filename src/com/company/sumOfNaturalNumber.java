package com.company;

import java.util.Scanner;

public class sumOfNaturalNumber {
     public static void main(String args[]) {
         Scanner s=new Scanner(System.in);
         long n=s.nextLong();
         long ans=n*(n+1l)/2l;
         System.out.println(ans);
    }
}
