/*
Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:
Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:
Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
Note:
The input string length won't exceed 1000.

*/
class Solution {
    public int countSubstrings(String s) {
         int count = 0;
        Boolean[][] dp = new Boolean[s.length()][s.length()];
        for(int i=s.length()-1; i >= 0; i--){
            for(int j=i; j < s.length(); j++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (i+1 > j-1 || dp[i+1][j-1]);
                if(dp[i][j])
                    ++count;
            }
        }
        return count;
    }
}