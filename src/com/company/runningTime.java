package com.company;
import java.util.* ;
public class runningTime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        int x=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i] > a[j]){
                    x++;
                }
            }
        }
        System.out.println(x);
    }
}
