class Solution {
    public boolean isPalindrome(String s) {
        System.out.println(s);
        int left = 0; int right = s.length() - 1;

        while(left < right){
            while(left < right && !isAlphaNum(s.charAt(left))){
                left++;
            }

            while(left < right && !isAlphaNum(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++; right--;
        }

        return true;
    }

    public boolean isAlphaNum(char c){
        if (
            (c >= 'a' && c <= 'z') ||
            (c >= 'A' && c <= 'Z') ||
            (c >= '0' && c <= '9')
        ) return true;
        else return false;
    }
}
