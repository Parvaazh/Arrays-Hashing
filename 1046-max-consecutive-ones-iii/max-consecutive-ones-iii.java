class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;int maxCount=0;int zeroCount=0;
        for(int right=0;right<nums.length;right++){
                if(nums[right]==0){
                    zeroCount++;
                }
                while(zeroCount>k){
                    if(nums[left]==0){
                        zeroCount--;
                    }
                    left++;
                }
                maxCount=Math.max(maxCount,right-left+1);
        }
        return maxCount;
    }
}