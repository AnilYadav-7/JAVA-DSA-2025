package com.DSA.recursion;

public class print1toN {
    public static void print(int n){
        if(n>5){
            return;
        }
        print(1+n);
        System.out.print(" "+n);
    }
    public static void main(String[] args) {
        int n=1;
        print(n);
    }
    
}
