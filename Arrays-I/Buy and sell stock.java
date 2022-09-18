
// Brute Force Approach

class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
    for(int i=0;i<prices.length;i++){
        for(int j=i+1;j<prices.length;j++){
            if(prices[j]>prices[i]){
                int c = prices[j]-prices[i];
                if(max<c){
                    max = c;
                }
            }
        }
    }
        return max;
    }
}


// Best Approach

class Solution {
    public int maxProfit(int[] prices) {
      int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < prices.length; i++) {
      minPrice = Math.min(minPrice, prices[i]);
      maxPro = Math.max(maxPro, prices[i] - minPrice);
    }
    return maxPro;
    }
}
