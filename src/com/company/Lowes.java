package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lowes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();;
        int m= sc.nextInt();;
        int[] l=new int[m];
        int[] r=new int[m];
        for(int i=0;i<m;i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(l[i]>l[j]){
                    int temp=l[i];
                    l[i]=l[j];
                    l[j]=temp;
                    temp=r[i];
                    r[i]=r[j];
                    r[j]=temp;
                }
            }
        }
        for(int i=0;i<m;i++){
            hm.put(l[i],r[i]);
        }
        System.out.println(hm);
        int[] count = new int[n+1];
        count[0]=0;
        int cov=0;
        for(int i=0;i<m;i++){
            if(i==0){
                Inc(count,0,hm.get(l[i]));
                cov=hm.get(l[i]);
            }
            else {
                for(int j=cov+1;j>=0;j--){
                    if(hm.containsKey(j)){
                        Inc(count,j,hm.get(j));
                        cov=hm.get(j);
                        break;
                    }
                }
            }
        }
        int res=0;
        if(find(count)){
            res=-1;
        }
        else
            res=sum(count);
        System.out.println(res);

    }
    static void Inc(int[] count,int start,int end){
        for(int i=start;i<=end;i++){
            count[i]++;
        }

    }
    static int sum(int[] count){
        int sum=0;
        for(int i=0;i<count.length;i++)
            sum+=count[i];
        return sum;
    }
    static boolean find(int[] count){
        for(int i=0;i<count.length;i++){
            if(count[i]==0)
                return true;
        }
        return false;
    }
}
