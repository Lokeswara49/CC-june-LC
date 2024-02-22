package com.company;

import java.util.Scanner;

public class KValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int k= sc.nextInt();
        int[] value = new int[n+1];
       for(int i=0;i<k;i++) {
           value[sc.nextInt()]++;
       }
       int ans = 1;
       for(int i=n;i>1;i--){
           if(value[i] >= k){
               ans = i;
               break;
           }
           else{
               int a = Math.floorDiv(i, 2);
               value[a] =  value[a]+value[i];
           }
       }
        System.out.println(ans);
    }
}
