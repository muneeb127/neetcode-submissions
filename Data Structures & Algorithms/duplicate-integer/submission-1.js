class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let bool = false;
        for (let i = 0; i < nums.length; i++){
            let checkNum = nums[i];
            for (let j = i+1; j < nums.length; j++){
                if (checkNum === nums[j]){
                    bool = true;
                    break;
                }
            }
        }

        return bool;
    }
}
