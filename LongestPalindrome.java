/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

*/

class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        int odd = 0;
        
        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i)] = count[s.charAt(i)] + 1;
        }
        int ans = 0;
        for(int j = 0; j<count.length; j++) {
            if(count[j] > 0 && count[j] %2 == 0) {
                ans = ans + count[j];
            }
            else if(count[j] > 0 && count[j] %2 !=0) {
                ans = ans + count[j]-1;
                odd = 1;
            }
        }
        
        return ans+odd;
    }
}