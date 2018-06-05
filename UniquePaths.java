/*A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?


Above is a 7 x 3 grid. How many possible unique paths are there?

Note: m and n will be at most 100.

Example 1:

Input: m = 3, n = 2
Output: 3
Explanation:
From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
1. Right -> Right -> Down
2. Right -> Down -> Right
3. Down -> Right -> Right
Example 2:

Input: m = 7, n = 3
Output: 28
*/

class Solution {
    public int uniquePaths(int m, int n) {
        /*
        
        We only need to store the previous row/column to perform the calculation for the next one. So an 1-d array would suffice. You could           also choose to iterate through m or n depending on which direction you choose to go (by row or by column). Note that the first               element of the array will always be 1.
        
        int[] arr= new int[m];
        
        Arrays.fill(arr, 1);
        
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                arr[j] = arr[j]+arr[j-1]; 
            }
        }
        
        return arr[m-1];
        */
        //********************OR*********************
        
        int[][] arr = new int[m+2][n+2];
        for(int i=0; i<m+2; i++){
            for(int j=0; j<n+2; j++){
                arr[i][j] = 0;
            }
        }
        
        arr[m][n+1] = 1;
        
        for(int r=m; r>=1; r--){
            for(int c=n; c>=1; c--){
                arr[r][c] = arr[r+1][c] + arr[r][c+1];
            }
        }
        return arr[1][1];
    }
}