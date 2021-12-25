package com.company;
import java.io.*;
import java.util.*;
public class hashingForPair {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        int count2=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    count++;
                }else
                    count2++;
            }
        }
        if(count>=1){
            System.out.println("1");
        }else if (count2>=1){
            System.out.println("0");
        } // your code here
    }
}