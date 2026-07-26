class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied=0;int extra=0;int maxExtra=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];
            }
        }
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                extra+=customers[i];
            }
        }
        maxExtra=extra;
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i-minutes]==1){
                extra-=customers[i-minutes];
            }
            if(grumpy[i]==1){
                extra+=customers[i];
            }
            maxExtra=Math.max(extra,maxExtra);
        }
        return satisfied+maxExtra;
    }
}