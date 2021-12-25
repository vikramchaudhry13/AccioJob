package com.company;
import java.util.* ;
public class insertionSort1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i;
        int a[] = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int c = 0, key = a[n - 1];
        for (int j = n - 2; j >= 0; j--) {

            if (key < a[j]) {
                a[j + 1] = a[j];
            }
            if (key >= a[j]) {
                a[j + 1] = key;
                c = 1;
            }
            for (i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println("");
            if (c == 1) {
                break;
            }

        }
    }
}

