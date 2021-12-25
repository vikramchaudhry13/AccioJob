package com.company;
import java.util.* ;
public class squareMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System .in );
        int n=s.nextInt() ;
        int mat[][]=new int[n][n] ;
        for(int i=0;i< n ;i++){
            for (int j=0;j<n  ;j++){
               mat[i][j]=s.nextInt() ; // gives diagonal elements sum for 3x3 matrix only.
            }                          // however square matrix of any size can be created
        }
        for(int i=0;i< n ;i++){
            System.out.println();
            for (int j=0;j<n  ;j++){
                System.out.print(" "+mat[i][j]);
            }
        }
        System.out.println();
        int sum=mat[0][0]+mat[0][2]+mat[1][1]+mat[2][0]+mat[2][2];
        System.out.println("sum of diagonal elements-->"+sum);
    }
}
