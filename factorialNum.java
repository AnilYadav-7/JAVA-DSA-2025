package com.DSA.recursion;

public class factorialNum {
    class Solution {
        public int factorial(int n) {
            if(n==0|n==1){
                return 1;
            }
            return n*factorial(n-1);
    }
}
    public static void main(String[] args) {
        Solution obj = new factorialNum().new Solution();
        int n = 5; // Example input
        int result = obj.factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }

}
