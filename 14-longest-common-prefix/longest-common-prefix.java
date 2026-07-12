class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "strs";
        String first=strs[0];String prefix="";
        for(int i=0;i<first.length();i++){
            for(int j=1;j<strs.length;j++){
                if (i >= strs[j].length())
                return prefix;
                if(first.charAt(i)!=strs[j].charAt(i)){
                    return prefix;
                } 
            }
            prefix=prefix+first.charAt(i); 
        }
        return prefix;
    }
}