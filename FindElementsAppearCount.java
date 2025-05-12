package com.DSA.Hashing;

public class FindElementsAppearCount {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,3,2,4,5};
        int n=arr.length;
        int[] count=new int[10];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<10;i++){
            if(count[i]>0){
                System.out.println(i+" "+count[i]);
            }
        }

    }
}
