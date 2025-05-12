package com.DSA.Basics;

public class reverseNum {
    public int solution(int n) {
        boolean isNegative=false;
        if(n<0){
            isNegative=true;
            n=-n; // convert to positive
        }
        long num=Math.abs((long)n);
        int rev=0;
        while(num>0){
            int ld=(int)(num%10); // last digit
            rev=rev*10+ld;
            num=num/10;

            if(rev>Integer.MAX_VALUE) return 0;
            
        }
        return isNegative ? (int)-rev : (int)rev;
    }
    public static void main(String[] args) {
        
        int n=-120283342;
        reverseNum rn=new reverseNum();
        System.out.println(rn.solution(n));
    }
    
}
