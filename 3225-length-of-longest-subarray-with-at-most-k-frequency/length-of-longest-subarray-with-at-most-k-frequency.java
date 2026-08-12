class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int left=0;int count=0;int maxCount=0;
        Map<Integer,Integer> map=new HashMap<>();
        if(nums.length==1){
            return 1;
        }
        for(int right=0;right<nums.length;right++){
                map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.get(nums[right])>k){
                map.put(nums[left],map.getOrDefault(nums[left],0)-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            maxCount = Math.max(maxCount, right - left + 1);
        }
        return maxCount;
    }
}