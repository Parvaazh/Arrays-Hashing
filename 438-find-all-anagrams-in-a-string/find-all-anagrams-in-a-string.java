class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left=0;
        List<Integer> result=new ArrayList<>();
        int WindowCount[]=new int[26];
        int pCount[]=new int[26];
        if(p.length()>s.length()){
            return result;
        }
        for(int i=0;i<p.length();i++){
            pCount[p.charAt(i)-'a']++;
        }
        for(int right=0;right<s.length();right++){
            WindowCount[s.charAt(right)-'a']++;
            if(right-left+1>p.length()){
                WindowCount[s.charAt(left)-'a']--;
                left++;
            }
            if(Arrays.equals(WindowCount,pCount)){
                result.add(left);
            }
        }
        return result;   
    }
}