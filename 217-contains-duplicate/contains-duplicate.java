class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int key:nums){
            if(!set.contains(key)){
                set.add(key);
            }else{
                return true;
            }
        }
        return false;
    }
}