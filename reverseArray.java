package com.DSA.recursion;

public class reverseArray {
        public void reverse(int[] arr, int n) {
            int left=0;
            int right=arr.length-1;
            while(left<right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        public static void main(String[] args) {
            reverseArray obj = new reverseArray();
            int[] arr = {1, 2, 3, 4, 5}; // Example input array
            obj.reverse(arr, arr.length);
            System.out.print("Reversed array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}