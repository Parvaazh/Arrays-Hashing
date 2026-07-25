class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;int maxCount=0;
        for(int i=0;i<k;i++){
            count+=arr[i];
        }
        if(count/k>=threshold){
            maxCount++;
        }
        for(int i=k;i<arr.length;i++){
            count+=arr[i];
            count-=arr[i-k];
            if(count/k>=threshold){
                maxCount++;
            }
        }
        return maxCount;
    }
}