package com.company;
import java.util.* ;
public class markAndToys {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int k=sc.nextInt();
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int item=0;int y=0;
        for(int i=0; i<n; i++){
            y=y+a[i];
            if(y<=k){
                item++;
            }
        }System.out.print(item);
    }
}
