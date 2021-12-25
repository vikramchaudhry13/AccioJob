package com.company;
import java.util.*;
import java.io.*;
public class bigLight {
    public static void main(String args[]) {
        int h1,h2,v1,v2;
        Scanner sc=new Scanner(System.in);
        h1=sc.nextInt();
        h2=sc.nextInt();
        v1=sc.nextInt();
        v2=sc.nextInt();
        int i=1,c=0;
        while(h1>=h2)
        {
            if(h1==h2)
            {
                c=1;
                break;
            }
            h1=h1+v1;
            h2=h2+v2;
            i++;
        }
        if(c==1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}