class Solution {
    /**
     * @param {string} path
     * @return {string}
     */
    simplifyPath(path) {
        let splitted = path.split('/');
        let stack = [];
        console.log(splitted);

        for(let i = 0; i < splitted.length; i++){
            if(splitted[i] == '' || splitted[i] == '.'){
                continue;
            }
            else if (splitted[i] === '..'){
                stack.pop();
            }
            else{
                stack.push(splitted[i]);
            }
            console.log(stack);
        }

        // console.log(stack);

        return '/' + stack.join('/');
    }
}
