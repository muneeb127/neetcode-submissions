class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word: strs){
            char[] sorted = word.toCharArray();
            Arrays.sort(sorted);
            String key = new String(sorted);
            
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(word);
            map.put(key, list);
        }

        List<List<String>> result = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
            result.add(entry.getValue());
        }

        return result;
    }
}
