package com.company;
import java.util.* ;
public class avgCal1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        double sum=0.0;
        for(int i=1;i<=n;i++){
            int x=s.nextInt();
            sum +=x;
        }
        double avg=sum/n;
        int ans=(int)(Math.floor(avg));
        System.out.println(ans);
    }
}
