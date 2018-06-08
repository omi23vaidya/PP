/*
A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

For example, these are arithmetic sequence:

1, 3, 5, 7, 9
7, 7, 7, 7
3, -1, -5, -9
The following sequence is not arithmetic.

1, 1, 2, 5, 7

A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.

A slice (P, Q) of array A is called arithmetic if the sequence:
A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.

The function should return the number of arithmetic slices in the array A.


Example:

A = [1, 2, 3, 4]

return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.
*/
class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        
        int ans = 0;
        int[] dp = new int[A.length+1];
        boolean willAppend = true;
        
        if(A.length < 3)
            return 0;
        
        for(int i=3; i<dp.length; i++){
            if(A[i-1]-A[i-2] == A[i-2]-A[i-3]){
                dp[i] = 1+dp[i-1];
                if(willAppend){                    
                    ans = ans+dp[i];
                }
                else{
                    ans++;
                    willAppend = true;
                }
               
            }
            else
            {
                dp[i]=0;
                willAppend = false;
            }
            
        }
        return ans;
        /*
        int[] dp = new int[A.length + 1];
        int numOfArSlices = 0;
        boolean ableToAppend = true;
        for (int i = 3; i < dp.length; i++) {
            if (A[i - 1] - A[i - 2] == A[i - 2] - A[i - 3]) {
                dp[i] = 1 + dp[i - 1];
                if (ableToAppend) {
                    numOfArSlices += dp[i];
                } else {
                    numOfArSlices++;
                    ableToAppend = true;
                }
            } else {
                ableToAppend = false;
                dp[i] = 0;
            }
        }
        return numOfArSlices;
        */
    }
}