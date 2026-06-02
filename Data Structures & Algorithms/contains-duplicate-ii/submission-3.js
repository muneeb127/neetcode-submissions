class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {boolean}
     */
    containsNearbyDuplicate(nums, k) {
        let map = new Map();

        for(let i = 0; i < nums.length; i++){
            if(map.has(nums[i])){
                let index = map.get(nums[i]);
                if(Math.abs(index - i) <= k) return true;
                else{
                    map.set(nums[i], i);
                }
            }
            else{
                map.set(nums[i], i);
            }
        }

        return false;
    }
}
