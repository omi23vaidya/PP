/*
Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
*/

class Solution {
    
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = 0;
        int ctr = len-1;
        int addOne = 1;
        
        while(ctr >= 0)
        {        
            
            int sum = digits[ctr] + addOne + carry;
            addOne  = 0;
            if( sum > 9)
            {
                digits[ctr] = sum % 10;
                carry = 1;                
            }
            else
            {
                digits[ctr] = sum;
                carry = 0;                
            }
            ctr--;
        }
        
        if(carry == 1)
        {
            int[] ans = new int[len+1];
            ans[0] = 1;
            for(int j = 0; j < len; j++)
            {
                ans[j+1] = digits[j];
            }
            return ans;
        }
        else      
            return digits;
    }
    
}