class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum=0;int maxSum=0;
        for(int right=0;right<k;right++){
            windowSum+=nums[right];
        }        
        maxSum=windowSum;
        for(int right=k;right<nums.length;right++){
            windowSum+=nums[right];
            windowSum-=nums[right-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return (double) maxSum/k;
    }
}