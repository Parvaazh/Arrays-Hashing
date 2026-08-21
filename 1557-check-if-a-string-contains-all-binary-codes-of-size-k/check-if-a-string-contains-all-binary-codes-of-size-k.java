class Solution {
    public boolean hasAllCodes(String s, int k) {
        Set<String> set=new HashSet<>();
        if(s.length()<k) return false;
        for(int i=0;i<=s.length()-k;i++){
            String pair=s.substring(i,i+k);
            set.add(pair);
        }
        if(set.size()==1<<k){
            return true;
        }
        return false;
    }
}