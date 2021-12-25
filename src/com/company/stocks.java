package com.company;
import java.util.* ;
public class stocks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int min=arr[0];
        int buy=0;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                buy=i;
            }
        }
        int sell=0;
        for(int i=buy;i<arr.length;i++){
            if(sell<arr[i]){
                sell=arr[i];
            }
        }
        int profit=sell-min;
        if(sell>min){
            System.out.println(profit);
        }else
            System.out.println("0");
    }
}
