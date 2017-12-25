/*
Determine whether an integer is a palindrome. Do this without extra space.
*/

class Solution {
    public boolean isPalindrome(int x) {
        int len = 0;
        int temp = x, sum = 0;
        
        len = String.valueOf(x).length();
        if(len == 1)
        {
            return true;
        }
        
        while(temp > 0)
        {
            int r = temp % 10;
            sum = (sum*10) + r;
            temp = temp/10;
        }
        if(sum == x)
            return true;
        else
            return false;
    }
}