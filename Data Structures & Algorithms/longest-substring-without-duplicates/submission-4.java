class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        int right = 0;
        Set<Character> seen = new HashSet<>();

        while(right < s.length()){
            if(seen.contains(s.charAt(right))){
                while(seen.contains(s.charAt(right))){
                    seen.remove(s.charAt(left));
                    left++;
                }

            }

            seen.add(s.charAt(right));
            right++;
            maxLen = Math.max(maxLen, right - left);

        }

        return maxLen;

    }
}
