package com.company;
import java.util.* ;
import java.io.* ;
public class averageCalc {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of students followed by respective marks obtained");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        double sum=0.0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        double avg=sum/n;
        int ans=(int) Math.floor(avg) ;
        System.out.println("average is-->"+ans);
    }
}
