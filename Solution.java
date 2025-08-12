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
