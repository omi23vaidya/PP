/*
Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++)
        {
            count[s.charAt(i)-'a']+=1;
        }
        for(int i=0; i<t.length(); i++)
        {
            count[t.charAt(i)-'a']-=1;
        }
        for(int i=0; i<count.length; i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}