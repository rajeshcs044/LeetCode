package com.rajesh.practice.easy;

import java.util.Arrays;

public class CountPrimes
{
    public static int countPrimes(int n)
    {
        if (n <= 1) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, 2, n, true);

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        //One more way
        /*boolean[] check = new boolean[n];
        for(int i=0; i< check.length; i++)
            check[i] = true;

        for(int i=2; i< Math.sqrt(n); i++)
        {
            if(check[i])
            {
                for(int j = 2*i; j< n; j+=i)
                {
                    check[j] = false;
                }
            }
        }

        int count=0;
        for(int i=2; i< n; i++)
        {
            if(check[i])
                count++;
        }*/

        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(countPrimes(10));
    }
}
