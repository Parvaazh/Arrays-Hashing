class Solution {
    public String minWindow(String s, String t) {
        int need[]=new int[128];
        int window[]=new int[128];
        for(char c:t.toCharArray()){
            need[c]++;
        }
        int required=0;
        for(int count:need){
            if(count>0){
                required++;
            }
        }
        int have=0;int left=0;int start=0;int minLength=Integer.MAX_VALUE;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            window[c]++;
            if(need[c]>0&&window[c]==need[c]){
                have++;
            }
            while(have==required){
                int windowLen=right-left+1;
                if(windowLen<minLength){
                    minLength=windowLen;
                    start=left;
                }
                char leftchar=s.charAt(left);
                window[leftchar]--;
                if(need[leftchar]>0&&window[leftchar]<need[leftchar]){
                    have--;
                }
                left++;
            }
        }
            if(minLength==Integer.MAX_VALUE){
                return "";
            }
            return s.substring(start,start+minLength);
        }
    }