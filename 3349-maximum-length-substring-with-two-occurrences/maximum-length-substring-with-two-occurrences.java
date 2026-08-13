class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;int count=0;int maxCount=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            count=right-left+1;
            while(map.get(c)>2){
                char v=s.charAt(left);
                map.put(v,map.getOrDefault(v,0)-1);
                if(map.get(v)==0){
                    map.remove(v);
                }
                left++;
                count=right-left+1;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}