//package com.company;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class OptXorSet {
//    static int xor=0;
//    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(System.in);
//            int t = sc.nextInt();
//            while (t-- > 0) {
//                int n = sc.nextInt();
//                int k = sc.nextInt();
//                if (k == 1) {
//                    System.out.println(n);
//                } else {
//                    int ans = 1;
//                    while (ans <= n) {
//                        ans = ans << 1;
//                    }
//
//                    int[] a = new int[n];
//                    for (int i = 0; i < n; i++){
//                        a[i] = i + 1;
//                    }
//
//                    findXor(a,ans,n,0);
//                }
//            }
//        }
//
//        catch (Exception ex) {
//            return;
//        }
//    }
//    static int findXor(int[] a,int sum,int n,int xor){
//        if(xor==sum){
//            xor=0;
//        }
//        else{
//            for(int i=0;i<n;i++){
//                xor=findXor(a,sum)
//            }
//        }
//    }
//}
