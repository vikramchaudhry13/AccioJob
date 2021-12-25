package com.company;
import java.util.* ;
public class book {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=s.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int book=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==t){
                book++;
                break;
            }else if(arr[i]<t){
                book++;
                t=t-arr[i];
            }
        }
        System.out.println(book);
    }
}
