class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        let map = new Map([
            ['(', ')'],
            ['{', '}'],
            ['[', ']'],
        ]);

        let stack = [];

        for(let i = 0; i < s.length; i++){
            if(map.has(s[i])){
                stack.push(s[i]);
            }
            else{
                if (stack.length <= 0 || map.get(stack.pop()) !== s[i]) return false;
            }
        }

        return stack.length === 0;

    }
}
