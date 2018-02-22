/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True
Example 2:

Input: 14
Returns: False
*/

class Solution {
    public boolean isPerfectSquare(int num) {
        /*This is a math problem：   
            1 = 1
            4 = 1 + 3
            9 = 1 + 3 + 5
            16 = 1 + 3 + 5 + 7
            25 = 1 + 3 + 5 + 7 + 9
            36 = 1 + 3 + 5 + 7 + 9 + 11
            …
            so 1+3+…+(2n-1) = (2n-1 + 1)n/2 = nn */
        
        int i=1;
        while(num>0) {
            num = num-i;
            i = i+2;
        }
        
        return num==0;
        
        //--------------------OR-----------------------
        if(num==1)
            return true;
        
        int left=1, right=num;
        while(left<=right) {
            int mid=left+(right-left)/2;
            if (mid==num/mid) {
                if(num%mid == 0)
                    return true;
                else
                    return false;
            
            } else if (mid>num/mid) right=mid-1;
            else left=mid+1;
        }
        return false;
    }
}