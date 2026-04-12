class Solution {
    public int mySqrt(int x) {
        int l = 0; int h = x;
        int res = 0;

        while(l <= h){
            int mid = l + (h - l) / 2;

            if((long) mid * mid == x){
                res = mid;
                break;
            }
            else if((long) mid * mid < x){
                res = mid;
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }

        return res;
    }
}