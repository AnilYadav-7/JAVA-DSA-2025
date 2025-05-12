package com.DSA.Better;

import java.util.HashMap;

public class numberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int ans=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(map.containsKey(num)){
                ans=ans+map.get(num);
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        System.out.println(ans);
    }
    
}
