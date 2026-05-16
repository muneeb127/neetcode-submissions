class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    majorityElement(nums) {
        // let majority;
        // let count = 0;

        // for(let i = 0; i < nums.length; i++){
        //     if(count === 0){
        //         majority = nums[i];
        //         count = 1;
        //     }
        //     else if(majority === nums[i]) count++;
        //     else count--;
        // }

        // return majority;

        let map = new Map();

        for(let num of nums){
            if(map.has(num)){
                map.set(num, map.get(num) + 1);
            }
            else{
                map.set(num, 1);
            }

            if(map.get(num) > nums.length / 2) return num;
        }
    }
}
