package com.company;
import java.io.* ;
import java.util.* ;
public class quickSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        } //your code here
    }
}
