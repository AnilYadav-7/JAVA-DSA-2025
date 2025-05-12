package com.DSA.Hashing;

import java.util.HashMap;

public class HashingBasicEx {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(1, 21);
        map.put(2,22);
        map.put(3, 33);
        map.put(4, 44);

        System.out.println(map.get(1));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue(22));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.getOrDefault(1, 1));

        for(int key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        for(int value: map.values()){
            System.out.println(value);
        }
        map.put(4,map.getOrDefault(4, 0)+1);
        System.out.println(map.get(4));
       
        for(int key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
    }
    
}
