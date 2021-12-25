package com.company;
import java.util.* ;
public class numberOfDaysInAMonth {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
        System.out.println("enter the month no. for which you want days");
            int n=s.nextInt();
            switch(n){
                case 1:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 3:
                    System.out.println("31");
                    break;
                case 4:
                    System.out.println("30");
                    break;
                case 5:
                    System.out.println("30");
                    break;
                case 6:
                    System.out.println("31");
                    break;
                case 7:
                    System.out.println("30");
                    break;
                case 8:
                    System.out.println("31");
                    break;
                case 9:
                    System.out.println("30");
                    break;
                case 10:
                    System.out.println("31");
                    break;
                case 11:
                    System.out.println("30");
                    break;
                case 12:
                    System.out.println("31");
                    break;
            }

        }
        // your code here
    }


