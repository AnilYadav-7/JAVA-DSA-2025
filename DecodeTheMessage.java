package com.DSA.Hashing;

import java.util.HashMap;

public class DecodeTheMessage {
    public static void main(String[] args) {
        String message = "the quick brown fox jumps over the lazy dog";
        String key = "the quick brown fox jumps over the lazy dog";
        DecodeTheMessage dm=new DecodeTheMessage();
        System.out.println(dm.decodeMessage(key, message));
    }

    public String decodeMessage(String key, String message) {
        HashMap<Character,Character>hm=new HashMap<>();
        int temp=97;
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch!=' ' && !hm.containsKey(ch)){
                hm.put(ch,(char)temp);
                temp++;
            }
        }
        String ans="";
        for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch==' '){
                ans+=" ";
            }else{
                ans+=hm.get(ch);
            }
        }
        return ans;
    }

}
