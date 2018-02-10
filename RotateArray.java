/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

Note:
Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.

[show hint]

Related problem: Reverse Words in a String II

*/

class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        reverse(nums, 0, len-k-1);
        reverse(nums, len-k, len-1);
        reverse(nums, 0, len-1);
    }
    
    public void reverse(int[] num, int left, int right)
    {
         while (left < right) {
            int t = num[left];
            num[left] = num[right];
            num[right] = t;
            left++;
            right--;
        }
    }
}