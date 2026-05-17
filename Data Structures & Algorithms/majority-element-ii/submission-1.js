class Solution {
    /**
     * @param {number[]} nums
     * @return {number[]}
     */
    majorityElement(nums) {
        let map = new Map();

        let result = [];
        let n = nums.length;

        for(let num of nums){
            map.set(num, (map.get(num) || 0) + 1);
            if(map.get(num) > n/3  && !result.includes(num)) result.push(num);
        }

        return result;
    }
}
