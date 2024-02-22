package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ShRoute {

    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            StringTokenizer st
                    = new StringTokenizer(br.readLine());
            int t= Integer.parseInt(st.nextToken());
            while (t-->0){
                 st = new StringTokenizer(br.readLine());
                int n=Integer.parseInt(st.nextToken());
                int m= Integer.parseInt(st.nextToken());
                int[] b=new int[m+1];
                int[] a=new int[n+1];
                st = new StringTokenizer(br.readLine());
                for(int i=1;i<n+1;i++)
                    a[i]=Integer.parseInt(st.nextToken());
                st = new StringTokenizer(br.readLine());
                for(int i=1;i<m+1;i++)
                    b[i] = Integer.parseInt(st.nextToken());

                int[] ans=new int[n+1];
                for(int i=0;i<n+1;i++)
                    ans[i]=-2;
                    for(int i=1;i<m+1;i++) {
                        if (ans[b[i]] == -2) {
                            if(a[b[i]]!=0)
                                ans[b[i]]=0;
                            else{
                                int right = -1;
                                for (int j = b[i]; j < n + 1; j++) {
                                    if (a[j] == 2) {
                                        right = j - b[i];
                                    }
                                }
                                int left = -1;
                                for (int j = b[i]; j >= 1; j--) {
                                    if (a[j] == 1) {
                                        left = b[i] - j;
                                    }
                                }
                                if (left == -1 && right == -1)
                                    ans[b[i]] = -1;
                                else if (left != -1 && right != -1)
                                    ans[b[i]] = Math.min(left, right);
                                else if ((left==-1 && right!=-1) || (right==-1 && left!=-1))
                                    ans[b[i]] = Math.max(left, right);
                            }
                        }
                    }
                    for(int i=1;i<m+1;i++)
                        System.out.print(ans[b[i]]+" ");
                System.out.println("");
                }
            }
        catch (Exception e){
            return;
        }
    }
}
