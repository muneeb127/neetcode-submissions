class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if (s.length !== t.length) return false;

        let sMap = new Map();
        let tMap = new Map();

        for(let c of s){
            sMap.set(c, (sMap.get(c) || 0) + 1);
        }

        for(let c of t){
            tMap.set(c, (tMap.get(c) || 0) + 1);
        }

        for(let [key, value] of sMap){
            if(tMap.get(key) == value){
                sMap.delete(key);
                tMap.delete(key);
            }
            else{
                return false;
            }
        }

        return (sMap.size === 0 && tMap.size === 0);
    }
}
