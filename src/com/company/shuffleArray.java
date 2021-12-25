package com.company;

import java.util.Scanner;

public class shuffleArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr1 = new int[2*n];
        int[] arr2 = new int[2*n];
        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }
        int[] arr3 = new int[3 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < 2 * n; i++){
            arr3[i + 1] = arr2[i];
        }
        for (int i = 0; i < 2 * n; i++){
            System.out.print(" "+arr3[i]);
        }
    }
}

