class Solution {
    public int minSwaps(int[] nums) {
        int swap=0;int count=0;int minSwap=0;int windowFreq=0;int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            windowFreq+=nums[i];
        }
        swap=count-windowFreq;
        minSwap=swap;
        for(int i=count;i<nums.length+count;i++){
            windowFreq+=nums[i%n];
            windowFreq-=nums[(i-count)%n];
            swap=count-windowFreq;
            minSwap=Math.min(minSwap,swap);
        }
        return minSwap;
    }
}