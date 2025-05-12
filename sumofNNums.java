package com.DSA.recursion;

public class sumofNNums {
        public int NnumbersSum(int N) {
            //your code goes here
          int sum=0;
          for(int i=1;i<=N;i++){
            sum+=i;
          }
          return sum;
        }
        public static void main(String[] args) {
            sumofNNums obj = new sumofNNums();
            int N = 5; // Example input
            int result = obj.NnumbersSum(N);
            System.out.println("Sum of first " + N + " numbers is: " + result);
        }
    }
