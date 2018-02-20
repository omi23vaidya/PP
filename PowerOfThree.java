/*
Given an integer, write a function to determine if it is a power of three.
*/

class Solution {
    public boolean isPowerOfThree(int n) {
    
    /* *******************WITHOUT LOOP BUT SLOWER************************
    double num=Math.log10(n)/Math.log10(3);
    if(num%1==0){
        return true;
    }else {
        return false;
    }
    */
        if (n < 3 && n != 1){
            return false;
        }
        while (n > 1) {
            if (n % 3 != 0){
                return false;
            }
            else{
                n /= 3;
            }
        }
        return true;
        
    }
}