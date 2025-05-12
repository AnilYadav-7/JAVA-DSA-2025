package com.DSA.Basics;

public class countDigit {
    public int solution(int n) {
        int count=0;
        while(n>0){
            int ld=n%10; // last digit
            count++;
            n=n/10;
            
        }
        return count;
    }
    public static void main(String[] args) {
       
        int n=12345;
        countDigit cd=new countDigit();
        System.out.println(cd.solution(n));
    }

}
