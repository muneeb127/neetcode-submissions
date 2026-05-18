class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    canJump(nums) {
        let goal = nums.length - 1;
        let index = goal - 1;

        while(index >= 0){
            if(nums[index] + index >= goal) goal = index;

            index--;
        }

        return goal == 0;
    }
}
