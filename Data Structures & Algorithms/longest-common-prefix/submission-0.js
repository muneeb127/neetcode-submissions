class Solution {
    /**
     * @param {string[]} strs
     * @return {string}
     */
    longestCommonPrefix(strs) {
        let first = strs[0];

        for(let i = 1; i < strs.length; i++){
            let second = strs[i];
            let str = "";

            for(let j = 0; j < first.length; j++){
                if(first[j] === second[j]) str += first[j];
                else break;
            }

            first = str;
        }

        return first;
    }
}
