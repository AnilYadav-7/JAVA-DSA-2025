package com.DSA.Hashing;

import java.util.HashMap;

public class MajorityElements {
    public static void main(String[] args) {
        String[] str={"hello","world","hello","java","hello","java"};
        HashMap<String, Integer> map = new HashMap<>();
        for(String s:str){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        // for(String key:map.keySet()){
        //         System.out.println(key+" appears "+map.get(key)+" times.");
        //     }
        // }

        for(String key:map.keySet()){
            if(map.get(key)>=str.length/2){
                System.out.println(key+" is the majority element.");
            }
        }
}
}
