/*
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
Example 1:
Input: "USA"
Output: True
Example 2:
Input: "FlaG"
Output: False
Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
*/

    class Solution {
        public boolean detectCapitalUse(String word) {
            if(word.length() == 1)
                return true;

            if(Character.isLowerCase(word.charAt(0))) {
                int i=1;
                    while(i<word.length()) {
                        if(Character.isUpperCase(word.charAt(i)))
                            return false;
                        i++;
                    }
                    return true;
            }
            else{
                if(Character.isUpperCase(word.charAt(1))){
                    int j=2;
                    while(j<word.length()){
                        if(Character.isLowerCase(word.charAt(j)))
                            return false;

                        j++;
                    }
                    return true;
                }
                else{
                    int k = 2;
                    while(k<word.length()) {
                        if(Character.isUpperCase(word.charAt(k)))
                            return false;

                        k++;
                    }
                    return true;
                }
            }

        }
    }