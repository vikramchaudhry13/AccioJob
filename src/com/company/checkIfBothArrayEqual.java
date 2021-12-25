package com.company;
import java.util.* ;
import java.io.*  ;
public class checkIfBothArrayEqual {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr1=new int[n];
        int []arr2=new int[n];
        for(int i=0 ; i<n ; i++){
            arr1 [i]=s.nextInt();
        }
        for(int i=0 ; i<n ; i++){
            arr2 [i]=s.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count=0;
        for(int i=0 ; i<n ; i++){
            if(arr1 [i] != arr2[i]){
                count++;
            }
        }
        if(count>=1){
            System.out.println("0");
        }else
            System.out.println("1");
    }
}
