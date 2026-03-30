class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        if(s.length%2 !== 0) return false;
        let last;
        let stack = [];
        const map = new Map([
            ['(',')'],
            ['{','}'],
            ['[',']'],
        ])
        for(let i = 0; i < s.length ; i++){
            if(s[i] == '(' || s[i] == '{' || s[i] == '[')
                stack.push(s[i])
            else{
                last = stack.pop();
                console.log("Last: ", last)
                console.log("MAP LAST ", map.get(last))
                console.log("s[i] ", s[i])
                if(s[i] !== map.get(last))
                    return false
            }
                
        }

        return stack.length === 0;
    }
}
