class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<List<Integer>> buckets = new ArrayList<>();

        for(int i = 0; i <= nums.length; i++){
            buckets.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            int key = entry.getKey();
            List<Integer> bucket = buckets.get(val);
            bucket.add(key);
        }  

        int[] result = new int[k];
        int pointer = 0;

        for(int i = buckets.size() - 1; i >= 0; i--){
            if (k == pointer) break;

            List<Integer> bucket = buckets.get(i);
            
            for(int j = bucket.size() - 1; j >= 0; j--){
                result[pointer++] = bucket.get(j);
            }
        }

        return result;
    }
}
