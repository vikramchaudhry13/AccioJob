package com.company;
import java.util.* ;
public class mergeSortedLists {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int n2 = s.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = s.nextInt();
        }
        int arr3[] = new int[n + n2];
        for (int i = 0; i < n; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < n2; i++) {
            arr3[n + i] = arr2[i];
        }
        Arrays.sort(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
        }
    }
}
