/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.

Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.

The order of output does not matter.

Example 1:

Input:
s: "cbaebabacd" p: "abc"

Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
Example 2:

Input:
s: "abab" p: "ab"

Output:
[0, 1, 2]

Explanation:
The substring with start index = 0 is "ab", which is an anagram of "ab".
The substring with start index = 1 is "ba", which is an anagram of "ab".
The substring with start index = 2 is "ab", which is an anagram of "ab".
*/
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
List<Integer> res = new LinkedList<>();
        if(p == null || s == null ||
            p.length() == 0 || s.length() < p.length()) return res;

        int[] counts = new int[128]; // there are 128 characters in ASCII
        char[] sc = s.toCharArray(), pc = p.toCharArray();

        // count frequency of chars in t
        for(int i = 0; i < pc.length; i++) {
            counts[pc[i]]++;
        }

        // we use a counter to indicate if t is completely matched
        int counter = pc.length, left = 0, right = 0, head = 0;
        int len = Integer.MAX_VALUE;

        while(right < sc.length){
            if(counts[sc[right]] > 0) {counter--;}
            counts[sc[right]]--;
            right++;

            while(counter == 0){

                // if we find a shorter substring, update min length and record
                // the start of this substring
                if(right-left == pc.length) {
                    res.add(left);
                }

                // now we move the left pointer to recover the part of the
                // dictionary with not-in-t chars
                counts[sc[left]]++;

                // if we encounter a char in t, then we restart to count the
                // minimum length of substring begining with the char beside it.
                // We end the inner loop by setting counter to 1
                if(counts[sc[left]] > 0){
                    counter++;
                }
                left++;
            }

        }
        return res;
    }
}

 //*******Easy to understand but suboptimal solution
 /*
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new LinkedList<Integer>();
        int[] orig = new int[26];
        for(int i=0; i<p.length(); i++) {
                    orig[p.charAt(i)-'a'] = orig[p.charAt(i)-'a']+1;
        }
        
        for(int i=0; i<=s.length()-p.length(); i++) {
            int[] temp = new int[26];
            for(int j=i; j<i+p.length(); j++) {
                temp[s.charAt(j)-'a'] = temp[s.charAt(j)-'a']+1;
            }
            
            if(Arrays.equals(orig, temp)){
                ans.add(i);
            }
        }
        return ans;
    }
}
 */       