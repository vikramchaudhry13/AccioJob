package com.company;
import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System .in ) ;
        String org=s.next() ;
        String rev="";
        for(int i=org.length()-1;i>=0;i--){ //remember (org.length-1) here -1 is very important & i>=0 is also very important.
            rev=rev+ org.charAt(i);            // basically whole for loop syntax is very important.
        }
        System.out.println("reverse string-->"+rev);
        System.out.println(org.length() );
    }
}
