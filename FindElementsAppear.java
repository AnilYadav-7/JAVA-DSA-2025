package com.DSA.Hashing;

import java.util.HashMap;

public class FindElementsAppear {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 1, 1, 3, 2, 4, 5};
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int num:arr){
        map.put(num,map.getOrDefault(num,0)+1);

    }
    for (int key : map.keySet()) {
            System.out.println(key + " appears " + map.get(key) + " times.");
        }
    }

}
