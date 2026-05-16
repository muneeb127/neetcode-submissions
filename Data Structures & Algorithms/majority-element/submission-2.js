class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    majorityElement(nums) {
        let majority;
        let count = 0;

        for(let i = 0; i < nums.length; i++){
            if(count === 0){
                majority = nums[i];
                count = 1;
            }
            else if(majority === nums[i]) count++;
            else count--;
        }

        return majority;
    }
}
