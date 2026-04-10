class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int len = 0;
        int left = 0;
        int right = 0;
        Set<Character> seen = new HashSet<>();

        while(right < s.length()){
            if(seen.contains(s.charAt(right))){

                while(seen.contains(s.charAt(right))){
                    seen.remove(s.charAt(left));
                    left++;
                    len--;
                }

            }

            seen.add(s.charAt(right));
            right++;
            len++;

            maxLen = Math.max(maxLen, len);

        }

        return maxLen;

    }
}
