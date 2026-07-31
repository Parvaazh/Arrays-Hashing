class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;int count=0;int windowFreq=1;
         if (k <= 1) return 0;
        for(int right=0;right<nums.length;right++){
                windowFreq*=nums[right];
            while(windowFreq>=k){
                windowFreq/=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}