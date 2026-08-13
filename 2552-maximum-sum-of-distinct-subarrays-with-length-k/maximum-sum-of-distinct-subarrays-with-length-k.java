class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long count = 0;    // Changed to long
        long maxCount = 0; // Changed to long
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            // 1. Add current element to map and sum
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            count += nums[right];

            // 2. Shrink window if duplicate exists OR window size > k
            while (map.get(nums[right]) > 1 || (right - left + 1) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                count -= nums[left];
                left++; // Always advance left when shrinking
            }

            // 3. Record max sum when valid window of size k is reached
            if (right - left + 1 == k) {
                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}