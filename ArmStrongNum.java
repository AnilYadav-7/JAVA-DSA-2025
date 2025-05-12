package com.DSA.Basics;

public class ArmStrongNum {
    public boolean isArmStrong(int n){
        boolean isNegative=false;
        if(n<0){
            isNegative=true;
            n=-n;
        }
        n=Math.abs(n);
        int sum=0;
        int originalNum=n;
        int numDigits=0;
        
        // Count the number of digits
        while(n>0){
            n=n/10;
            numDigits++;
        }
        
        n=originalNum; // Reset n to original value
        
        // Calculate the sum of digits raised to the power of numDigits
        while(n>0){
            int ld=n%10; // last digit
            sum+=Math.pow(ld,numDigits);
            n=n/10;
        }
        
        if(isNegative){
            return false;
        }else{
            return originalNum==sum;
        }
    
    }
    public static void main(String[] args) {
        int n= 153;
        ArmStrongNum an=new ArmStrongNum();
        System.out.println(an.isArmStrong(n));
        
    }
    
}
