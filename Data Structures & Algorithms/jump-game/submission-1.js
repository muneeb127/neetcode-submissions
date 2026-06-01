class Solution{
    canJump(nums){
        let goal = nums.length - 1;
        let pointer = goal - 1;

        while(pointer >= 0){
            if(nums[pointer] + pointer >= goal){
                goal = pointer;
            }
            pointer--;
        }

        return goal == 0;
    }
}