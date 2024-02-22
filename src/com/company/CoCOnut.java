package com.company;

import java.util.Scanner;

public class CoCOnut {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
            while(t-->0){
                int ra= sc.nextInt();
                int rb= sc.nextInt();
                int xa= sc.nextInt();
                int xb= sc.nextInt();
                System.out.println((xa/ra)+(xb/rb));
            }
        }
        catch (Exception e){
            return;
        }
    }
}
