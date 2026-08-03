class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();

        // Store frequencies of t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int matched = 0;
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        int required = map.size();

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            if (map.containsKey(c)) {

                map.put(c, map.get(c) - 1);

                if (map.get(c) == 0) {
                    matched++;
                }
            }

            while (matched == required) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) == 1) {
                        matched--;
                    }
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minLength);
    }
}