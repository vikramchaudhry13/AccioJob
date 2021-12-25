package com.company;
import java.util.* ;
import java.io.* ;
public class gcdEuclidean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        System.out.println(findGCD(x,y));
    }
    static long findGCD(long x, long y)
    {
        long r=0, a, b;
        a = (x > y) ? x : y; // a is greater number
        b = (x < y) ? x : y; // b is smaller number
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        return r;
    }
}
