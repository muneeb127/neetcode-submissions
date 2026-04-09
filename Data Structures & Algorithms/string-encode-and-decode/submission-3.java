class Solution {

    public String encode(List<String> strs) {

        StringBuilder result = new StringBuilder();
        
        for(String s : strs){
            result.append(s.length()).append("#").append(s);
        }

        return result.toString();        
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        String word = "";
        int i = 0;
        
        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j)); // substring = 0 -> n - 1;

            i = j + 1;
            j = i + length;

            strs.add(str.substring(i , j));
            i = j;
        }

        return strs;
        // for(char s : str.toCharArray()){
        //     if(s == '#'){
        //         strs.add(word);
        //         word = "";
        //     }
        //     else{
        //         word += s;
        //     }
        // }

        // strs.add(word);

        // return strs;
    }
}
