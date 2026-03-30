class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        let bool = false;
        const map1 = new Map();
        const map2 = new Map();

        if(s.length !== t.length)
            return false;

        let count = 0;
        for(let i = 0; i < s.length; i++){
            if(map1.has(s[i])){
                count = map1.get(s[i]);
                map1.set(s[i], count + 1)
            }
            else{
                map1.set(s[i], 1);
            }
        }

        let count_2 = 0;
        for(let i = 0; i <t.length; i++){
            if(map2.has(t[i])){
                count_2 = map2.get(t[i]);
                map2.set(t[i], count_2 + 1)
            }
            else{
                map2.set(t[i], 1);
            }
        }

        for(var [key, val] of map1){
            if(map2.has(key) == false)
                return false

            if(map1.get(key) !== map2.get(key)){
                // console.log(key , map1.get(key))
                // console.log(key, map2.get(key))
                return false
            }
        }
        return true
    }
}
