class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left=0;
        Set<Integer> set=new HashSet<>();
        for(int right=0;right<nums.length;right++){
            int curr=nums[right];
            if(set.contains(curr)&&set.size()<=k){
                return true;
            }
            set.add(curr);
            if(set.size()>k){
                set.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}