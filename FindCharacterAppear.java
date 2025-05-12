package com.DSA.Hashing;

import java.util.HashMap;

public class FindCharacterAppear {
    public static void main(String[] args) {
        String str="aabcdaba";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0 )+1);
        }
        for(char key:map.keySet()){
            System.out.println(key+" appears "+map.get(key)+" times.");
        }
    }
    
}
