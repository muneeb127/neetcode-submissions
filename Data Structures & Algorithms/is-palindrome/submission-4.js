class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    
    isPalindrome(s) {
        
        let spaceless = '';
        for(let i = 0; i<s.length; i++){
            if((s.charCodeAt(i)>=65 && s.charCodeAt(i)<=90) || (s.charCodeAt(i)>=97 && s.charCodeAt(i)<=122) ||(s.charCodeAt(i)>=48 && s.charCodeAt(i)<=57))
                spaceless+= s[i];
        }
        console.log("Spaceless: ", spaceless)

        spaceless = spaceless.toLowerCase();
        let j = spaceless.length - 1;
        let bool = true;
        let i = 0;
        
        while(i<j){
            if(spaceless[i] !== spaceless[j]){
                bool = false
                break;
            }
            i++;
            j--;
        }
        
        return bool
    }
}
