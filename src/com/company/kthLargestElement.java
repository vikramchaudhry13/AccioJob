package com.company;
import java.util.* ;
public class kthLargestElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-k]);
    }
}
