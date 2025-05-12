package com.DSA.Hashing;

public class FindCharactersAppearCount {
    public static void main(String[] args) {
        String str="aabcdaba";
        int n=str.length();
        int[] count=new int[26];
        for(int i=0;i<n;i++){
            count[str.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(count[i]>0){
                System.out.println((char)(i+'a')+" "+count[i]);
            }
        }
    }
    
}
