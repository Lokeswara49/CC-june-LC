package com.company;

import java.util.Scanner;

public class ChfHeist {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while (t-->0){
                int D= sc.nextInt();
                int d= sc.nextInt();
                int P= sc.nextInt();
                int Q= sc.nextInt();;
                int total=0;
                int quo=D/d;
                total+=(P*quo);
                int temp=(quo*(quo-1))/2;
                total+=(temp*Q);
                total*=d;
                int rem=D%d;
                total+= (rem)*(P+(quo*Q));
                System.out.println(total);
            }
        }
        catch(Exception e) {
            return;
        }
    }
}
