class Solution {
    public int majorityElement(int[] nums) {
        int current=0;int count=0;int candidate=0;
        for(int i=0;i<nums.length;i++){
            current =nums[i];
            if(count==0){
                candidate=current;
            }if(current==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }    
}