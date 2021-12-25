package com.company;
import java.util.*;
import java.io.* ;
public class minimumInSortedAndRotatedArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        int min=arr[0];
        int min2=arr[1];
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]<=min){
                    min=arr[i];
                }else if(arr[j]<=min2){
                    min2=arr[j];
                }
            }
        }
        int smallest=0;
        if (min>min2){
            smallest=min2;
            System.out.println(smallest);
        }else if(min<min2){
            smallest=min;
            System.out.println(smallest);
        }
        //your code here
    }
}
