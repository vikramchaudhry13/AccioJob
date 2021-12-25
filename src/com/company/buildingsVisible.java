package com.company;
import java.util.* ;
import java.io.* ;
public class buildingsVisible {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long []arr=new long [n+1];
        for(int i=0;i<n;i++){
            arr[i]=s.nextLong();
        }
        arr[n]=0;
        for(int i=0;i<n+1;i++){
            System.out.print(" "+arr[i]);
        }
        int count=1;
        for(int i=0 ; i<n ; i++) {
            if (arr[i] < arr[i+1]) {
                    count++;
                }
            }
         System.out.println();
         System.out.println(count);
   }
}
