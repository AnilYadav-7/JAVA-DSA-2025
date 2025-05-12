package com.DSA.Basics;

public class PalindromeNum {
    public boolean isPalindrome(int n){
        boolean isNegative=false;
        if(n<0){
            isNegative=true;
            n=-n;
        }
        n=Math.abs(n);
        int reverseNum=0;
        int originalNum=n;
        while(n>0){
            int ld=n%10;
            reverseNum=reverseNum*10+ld;
            n=n/10;
        }
        if(isNegative){
            return false;
        }else{
            return originalNum==reverseNum;
        }
    }
    public static void main(String[] args) {
        int n=121;
        PalindromeNum pn=new PalindromeNum();
        System.out.println(pn.isPalindrome(n));
    }
    
}
