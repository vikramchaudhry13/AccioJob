package com.company;
import java.io.* ;
import java.util.* ;
public class factUsingLoop {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();
        long  fact=1;
        for(long i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
