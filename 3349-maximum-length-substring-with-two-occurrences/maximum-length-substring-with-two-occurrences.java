class Solution {
    public int maximumLengthSubstring(String s) {
        int window[]=new int[26];
        int left=0;int maxLen=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
                window[c-'a']++;
            while(window[c-'a']>2){
                char v=s.charAt(left);
                window[v-'a']--;
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;   
    }
}