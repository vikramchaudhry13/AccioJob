package com.company;
import java.util.* ;
import java.io.* ;
public class pairSumInSortedArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        if(count>=1){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
