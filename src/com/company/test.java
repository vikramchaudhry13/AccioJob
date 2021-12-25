package com.company;
import java.util.*;
public class test {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int original[][] =new int[row ][col ];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                original[i][j]=s.nextInt() ;
            }
        }
//creating another matrix to store transpose of a matrix
        int transpose[][] = new int[row ][col ];
        //Code to transpose a matrix
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                transpose[i][j] = original[j][i]; //<-----> Most Important thing to remember <---->
            }
        }
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();//new line
        }
    }
}