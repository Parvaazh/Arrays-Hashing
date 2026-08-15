class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Integer> set = new TreeSet<>();
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            int curr = nums[right];
            Integer x = set.ceiling(curr - valueDiff);
            if (x != null && x <= curr + valueDiff) {
                return true;
            }
            set.add(curr);
            if (right - left >= indexDiff) {
                set.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}