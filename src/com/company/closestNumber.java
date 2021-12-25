package com.company;
import java.util.* ;
public class closestNumber {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr= new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min=arr[n-1];
            int[] small = new int[n*2];
            int count =0; //why
            for(int i =0;i<n;i++){
                for(int j=i+1; j<n;j++){
                    int temp_min = arr[j]-arr[i];
                    if(min> temp_min){
                        min = temp_min;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++){
                    if(arr[j]-arr[i] == min){
                        small[count] = arr[i];
                        small[count+1] = arr[j];
                        count = count+2;
                    }
                }
            }
            for(int i=0;i<count ; i++){
                if(small[i]==0){break;}
                System.out.print(small[i]+" ");
            }
        }
    }

