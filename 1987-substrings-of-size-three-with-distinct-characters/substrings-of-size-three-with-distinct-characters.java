class Solution {
    public int countGoodSubstrings(String s) {
        int left=0;int count=0;
        Set<Character> set=new HashSet<>();
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if(set.size()==3){
                count+=1;
                set.remove(s.charAt(left));
                left++;
            }
        }
        return count;
    }
}