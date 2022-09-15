
// BRUTE FORCE APPROACH

class Solution {
    public static int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i; j <= n - 1; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++){
                    sum = sum + nums[k];
                if (sum > max_sum) {
                    max_sum = sum;
                }
            }
            }
        }
        return max_sum;
    }
}

// BETTER APPROACH

class Solution{
 public static int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int curr_sum = 0;
            for (int j = i; j < nums.length; j++) {
                curr_sum += nums[j];
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
             }
        }
        return max_sum;
 }
}


// BEST APPROACH

class Solution {
    public int maxSubArray(int[] nums) {
       int max=Integer.MIN_VALUE , max_sum=0 ; 
        for(int i=0;i<nums.length;i++){ 
            max_sum+=nums[i]; 
            
            if(max_sum>max)
            { 
                max=max_sum;  
            } 
            if(max_sum<0)
            {
                max_sum=0; 
                
            } 
        } 
 
        return max; 
    }
}
