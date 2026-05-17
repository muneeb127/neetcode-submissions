class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums, k) {
        let map = new Map();

        for(let i = 0; i < nums.length; i++){
            // if(map.has(nums[i])){
            //     map.set(nums[i], map.get(nums[i]) + 1);
            // }
            // else{
            //     map.set(nums[i], 1);
            // }

            map.set(nums[i], (map.get(nums[i]) || 0) + 1);
        }

        let buckets = new Array(nums.length);
        console.log(buckets);
        console.log(map);

        for(let i = 0; i <= nums.length; i++){
            buckets[i] = [];
        }

        console.log(buckets);

        for(let [key, value] of map){
            let bucket = buckets[value];
            bucket.push(key);
        }

        console.log(buckets);

        let result = [];

        for(let i = buckets.length - 1; i >= 0; i--){

            let bucket = buckets[i];

            for(let j = bucket.length - 1; j >= 0; j--){
                result.push(bucket[j]);
                if (result.length === k) return result;
            }
        }
    }
}
