package com.company;
import java.util.* ;
import java.io.* ;
public class largestNoFromList {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long []arr=new long[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextLong();
        } //your code here
        Arrays.sort(arr ) ;
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=n-1 ; i>=0 ; i--){
            System.out.print(arr[i]);
        }
    }
}
