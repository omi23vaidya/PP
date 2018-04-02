/*
Given a List of words, return the words that can be typed using letters of English alphabets on only one row's of American keyboard.

Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]

Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
*/

class Solution {
    public String[] findWords(String[] words) {
        String[] map = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        ArrayList<String> ans = new ArrayList<String>();
        
        for(int i=0; i<words.length; i++) {
            char[] arr = words[i].toLowerCase().toCharArray();
            int index = 0;
            for(int j=0; j<map.length; j++) {
                if(map[j].indexOf(arr[0]) == -1)
                    continue;
                index = j;
            }
            int flag = 0;
            for(int k=1; k<arr.length; k++) {
                if(map[index].indexOf(arr[k]) == -1) {
                    flag = -1;
                    break;
                }                    
            }
            if(flag!=-1)
                ans.add(words[i]);
        }
        String[] res = new String[ans.size()];
        res = ans.toArray(res);
        return res;
    }
}