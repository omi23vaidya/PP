/*
Description:

Count the number of prime numbers less than a non-negative number, n.
*/

class Solution {
    public int countPrimes(int n) {
        /*
        striking of all multiples of 2,3,..... and doing this till i*i is less than n
        Explanation: http://www.geeksforgeeks.org/sieve-of-eratosthenes/
        */
        
        int count = 0;
        boolean[] notPrimes = new boolean[n];
        
        if(n==0 || n==1 || n==2)
        {
            return 0;
        }
        notPrimes[0] = true;
        notPrimes[1] = true;
        
        for(int i=2; i*i<n; i++)
        {
            if(notPrimes[i]==false)
            {
                int j=2;
                while(i*j<n)
                {
                   notPrimes[i*j]=true;
                   j++;
                }
            }
            
        }
        for(int k=0; k<n; k++)
        {
            if(notPrimes[k]==false)
                count++;
        }
        return count;
    }
}