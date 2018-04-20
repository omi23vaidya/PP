/*
In this method, instead of iterating over all the integers to find the factors of num, we only iterate upto the √​n. The reasoning behind this can be understood as follows.

Consider the given number numnum which can have m distinct factors, namely n_1, n_2,..., n_m. Now, since the number numnum is divisible by n_i, it is also divisible by n_j = num/n_1 i.e. n_i*n_j=num. Also, the largest number in such a pair can only be up to √​num (because \sqrt{num} * \sqrt{num}=num. Thus, we can get a significant reduction in the run-time by iterating only upto sqrt{num} and considering such n_i's and n_j's in a single pass directly.

Further, if sqrt{num} is also a factor, we have to consider the factor only once while checking for the perfect number property.

We sum up all such factors and check if the given number is a Perfect Number or not. Another point to be observed is that while considering 1 as such a factor, num will also be considered as the other factor. Thus, we need to subtract num from the sum.
*/

class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 0)
            return false;
        
        int sum = 0;
        for(int i=1; i*i<=num; i++) {
            if(num%i == 0) {
                sum = sum + i;
            
            if(i*i != num) {
                sum = sum + num/i;
                }
            }
        }
        
        return (sum-num) == num;
    }
}
