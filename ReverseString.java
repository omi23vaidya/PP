/*
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

class Solution {
    public String reverseString(String s) {
        char[] sArr = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        
        while(start<end)
        {
            char temp = sArr[start];
            sArr[start] = sArr[end];
            sArr[end] = temp;
            start++;
            end--;
        }
        
        return String.valueOf(sArr);
    }
}