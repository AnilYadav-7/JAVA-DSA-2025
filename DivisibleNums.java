package com.DSA.Basics;

import java.util.ArrayList;
import java.util.List;

public class DivisibleNums {
    public int[] divisors(int n){
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i){
                    list.add(n/i);
                }
            }
        }
        // Sort the list in ascending order
        list.sort(Integer::compareTo);
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int n=36;
        DivisibleNums dn=new DivisibleNums();
        int[] arr=dn.divisors(n);
        System.out.print("Divisors of "+n+" are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
