class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    getConcatenation(nums) {
        let length = nums.length; 
        let ans = new Array(length * 2);

        for(let i = 0; i < nums.length ; i++){
            ans[i] = nums[i];
        }

        for(let i = nums.length; i < 2 * nums.length ; i++){
            ans[i] = nums[i - nums.length];
        }

        return ans;
    }
}
