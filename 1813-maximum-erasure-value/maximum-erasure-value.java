class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left=0;int count=0;int maxSum=0;
        Set<Integer> set=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                count-=nums[left];
                left++;
            }
            set.add(nums[right]);
            count+=nums[right];
            maxSum = Math.max(maxSum, count);
        }
        return maxSum;
    }
}