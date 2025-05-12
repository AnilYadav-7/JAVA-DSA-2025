package com.DSA.Optimal;

import java.util.HashMap;

public class numberOfGoodpairs {
    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(int key:map.keySet()){
            int n=map.get(key);
            ans+=((n*(n-1))/2);
        }
        System.out.println(ans);
    }

}
