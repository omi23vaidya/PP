/*
Valid Palindrome

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.

*/

class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.length(); i++)
        {
            if((s.charAt(i) >='a' 
               && s.charAt(i) <= 'z') 
               || (s.charAt(i) >= 'A'
               && s.charAt(i) <= 'Z')
               || (s.charAt(i) >= '0' 
               && s.charAt(i) <= '9'))
            {
                sb.append(s.charAt(i));
            }                
        }
        
        System.out.println(sb);
        
        if(sb.length() == 0)
            return true;
        else
        {
            int start = 0;
            int end = sb.length() -1;
            while(start < end)
            {
                if(Character.toUpperCase(sb.charAt(start)) != Character.toUpperCase(sb.charAt(end)))
                {
                    return false;
                }
                else{
                    start++;
                    end--;
                }
            }
            return true;
        }
        
    }
}


//*****************Optimized********************

class Solution {
    public boolean isPalindrome(String s) {
        
    if (s.isEmpty()) {
        	return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
        	cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if(!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }
        
        return true;
    }
}