/*
Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".

Note:
The vowels does not include the letter "y".
*/

class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length()-1;
        char[] sArray = s.toCharArray();
        
        
        while(start < end){
            if("AEIOUaeiou".indexOf(sArray[start]) >= 0 && "AEIOUaeiou".indexOf(sArray[end]) >= 0) {
                char temp = sArray[start];
                sArray[start] = sArray[end];
                sArray[end] = temp;
                
                start++;
                end--;
                continue;
            }
            
            if("AEIOUaeiou".indexOf(sArray[start]) >= 0) {
                end--;
                continue;
            }
               
            if("AEIOUaeiou".indexOf(sArray[end]) >= 0) {
                start++;
                continue;
            }
            
            start++;
            end--;               
        }
        return String.valueOf(sArray);       
    }
}