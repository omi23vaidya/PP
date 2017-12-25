/*
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

*/

class Solution {
    public int strStr(String haystack, String needle) {
        String h = haystack;
        String n = needle;
        int hLen = haystack.length();
        int nLen = needle.length();
        
        if(n.isEmpty())
        {
            return 0;
        }
        else
        {
            for(int i = 0 ; i < hLen ; i++)
            {
                if(h.charAt(i) == n.charAt(0))
                {
                    if((i+nLen-1) < hLen && h.substring(i,i+nLen).equals(n))
                    {
                        return i;
                    }
                    
                }
            }
        }
        return -1;
    }
}