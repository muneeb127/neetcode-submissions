class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums, target) {
        let bool = false;
        let sum = 0;
        let number = []
        for( let i = 0; i < nums.length; i++){
            for (let j = 0 + 1; j < nums.length; j++){
                sum = 0;
                sum = nums[i] + nums[j];
                console.log("i", nums[i]);
                console.log("j", nums[j]);
                if(sum == target && i != j){
                    number[0] = i;
                    number[1] = j;
                    bool = true;
                    break;
                }         
                
                if(bool)
                    break
            }
        }

        return number;
    }
}
