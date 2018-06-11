/*
Given a string S, find the longest palindromic substring in S.

Substring of string S:

S[i...j] where 0 <= i <= j < len(S)

Palindrome string:

A string which reads the same backwards. More formally, S is palindrome if reverse(S) = S.

Incase of conflict, return the substring which occurs first ( with the least starting index ).

Example :

Input : "aaaabaaa"
Output : "aaabaaa"
*/

/***BRUTE FORCE***
public class Solution {
    public String longestPalindrome(String A) {
        StringBuilder longest = new StringBuilder("");
        for(int i=0; i<A.length(); i++){
            //int start = i;
            for(int j=A.length()-1; j>=i; j--){
                if(A.charAt(i) == A.charAt(j)){
                    int st = i;
                    int end = j;
                    while(st <= end && A.charAt(st) == A.charAt(end)){
                        st++;
                        end--;
                    }
                    StringBuilder isPalin = new StringBuilder(A.substring(i, j+1));
                    if(isPalin.toString().equals(isPalin.reverse().toString()) && isPalin.toString().length() > longest.toString().length()){
                        //System.out.println("i: " + i + " j: " + j + " isPalin: "+isPalin );
                        longest = isPalin;
                    }
                }
            }
        }
        return longest.toString();
    }
}
********/

public class Solution {
    private int lo, maxLen;
    public String longestPalindrome(String A) {
        
        StringBuilder longest = new StringBuilder("");
        int len = A.length();
        if (len < 2)
            return A;
    
        for (int i = 0; i < len-1; i++) {
            extendPalindrome(A, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(A, i, i+1); //assume even length.
        }
        return A.substring(lo, lo + maxLen);
    }
    private void extendPalindrome(String A, int j, int k) {
    while (j >= 0 && k < A.length() && A.charAt(j) == A.charAt(k)) {
        j--;
        k++;
    }
    if (maxLen < k - j - 1) {
        lo = j + 1;
        maxLen = k - j - 1;
    }
}
}
