class Solution {
    public int buyChoco(int[] prices, int money) {
        int max = Integer.MAX_VALUE;
        int sum=0;
       for(int i=0;i<prices.length;i++)
       {
           for(int j=i+1;j<prices.length;j++)
           {
               sum = prices[i] + prices[j];
               if(sum <= max)
               {
                   max = sum;
               }
           }
       }
       if(max <= money)
       {
           return money-max;
       }
        return money;
    }
}