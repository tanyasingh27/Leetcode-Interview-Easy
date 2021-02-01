//********************* Question *****************************

/*
Count the number of prime numbers less than a non-negative number, n.

Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0

Constraints:

0 <= n <= 5 * 106
 */

//********************* Solution *****************************
package com.tanya;

// Sieve of Eratosthenes

public class CountPrime {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        int count = 0;

        for(int j=0; j < n; j++){
            prime[j] = true;
        }

        for(int i=2; i*i<n; i++){
            if(prime[i]){
                for(int p = i*i; p < n; p += i){
                    prime[p] = false;
                }
            }
        }

        for(int j=2; j < n; j++){
            if(prime[j]) count++;
        }

        return count;
    }
}