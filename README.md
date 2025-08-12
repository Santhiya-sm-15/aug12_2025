# aug12_2025
The problem that i solved today in leetcode

In a candy store, there are different types of candies available and prices[i] represent the price of  ith types of candies. You are now provided with an attractive offer.
For every candy you buy from the store, you can get up to k other different candies for free. Find the minimum and maximum amount of money needed to buy all the candies.
Note: In both cases, you must take the maximum number of free candies possible during each purchase.

Code:
class Solution {
    public ArrayList<Integer> minMaxCandy(int[] prices, int k) {
        int n=prices.length;
        ArrayList<Integer> res=new ArrayList<>();
        Arrays.sort(prices);
        int amt=0;
        int i=0,j=n-1;
        while(i<=j)
        {
            amt+=prices[i];
            int x=0;
            while(x<k && j>i)
            {
                x++;
                j--;
            }
            i++;
        }
        res.add(amt);
        amt=0;
        i=n-1;
        j=0;
        while(j<=i)
        {
            amt+=prices[i];
            int x=0;
            while(x<k && j<i)
            {
                x++;
                j++;
            }
            i--;
        }
        res.add(amt);
        return res;
    }
}
