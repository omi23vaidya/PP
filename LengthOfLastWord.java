/*
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
*/

class Solution {
    public int lengthOfLastWord(String s) {
        int len=s.length(), lastLength=0;
    
    while(len > 0 && s.charAt(len-1)==' '){
        len--;
    }
    
    while(len > 0 && s.charAt(len-1)!=' '){
        lastLength++;
        len--;
    }
    
    return lastLength;
    }
}