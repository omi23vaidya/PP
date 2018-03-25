/*
Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
Example 1:
Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
Example 2:
Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to outp

*/

class Solution {
    public int findComplement(int num) {
        
        /*
        To find complement of num = 5 which is 101 in binary.
        First ~num gives ...11111010 but we only care about the rightmost 3 bits.
        Then to erase the 1s before 010 we can add 1000
        */
        return ~num + (Integer.highestOneBit(num) << 1);
    }
}