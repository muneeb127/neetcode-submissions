class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        let map = new Map();

        for(let i = 0; i < strs.length; i++){
            let str = strs[i].split('').sort().join('');

            if(map.has(str)){
                let arr = map.get(str);
                arr.push(strs[i]);
            }
            else{
                map.set(str, [strs[i]]);
            }
        }

        let results = [];

        for(let [key, val] of map){
            results.push(val);
        }

        return results;
    }
}
