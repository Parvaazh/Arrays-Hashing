class Solution {
    public int maxProduct(int n) {
        int extracted=0;int max1=-1;
        int max2=-1;
        while(n>0){
            extracted=n%10;
            if(max1<extracted){
                max2=max1;
                max1=extracted;
            }else if(extracted>max2){
            max2=extracted;
            }
            n=n/10;
        }
        return max1*max2;
    }
}