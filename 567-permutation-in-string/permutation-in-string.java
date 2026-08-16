class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int WindowCount[]=new int[26];
        int sCount[]=new int[26];
        if(s1.length()>s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            WindowCount[s1.charAt(i)-'a']++;
        }
        for(int right=0;right<s2.length();right++){
            sCount[s2.charAt(right)-'a']++;
            if(right-left+1>s1.length()){
                sCount[s2.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(WindowCount,sCount)) return true;
        }
        return false;
    }
}