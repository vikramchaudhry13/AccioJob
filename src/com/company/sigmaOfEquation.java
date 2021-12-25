package com.company;
import java.util.* ;
import java.io.* ;
public class sigmaOfEquation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long N=s.nextLong();
        long ans=0;
        for(long i=1;i<=N;i++){
         ans=ans+(((i+1)*(i+1))-(3*i+1)+i);
        }
        System.out.println(ans);
    }
}
