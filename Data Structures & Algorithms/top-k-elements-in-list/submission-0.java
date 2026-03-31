class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0) + 1);
        }

        List<List<Integer>> buckets = new ArrayList<>();

        for(int i = 0; i <= nums.length; i++){
            buckets.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry: frequency.entrySet()){
            int num = entry.getKey();

            List<Integer> bucket = buckets.get(entry.getValue());
            bucket.add(num);
        }

        System.out.println(buckets);

        int[] result = new int[k];
        int pointer = 0;

        for(int i = buckets.size() - 1; i >= 0; i--){
            if(pointer == k) break;
            
            List<Integer> list = buckets.get(i);
            
            if(list.size() > 0){
                for(int j = 0; j < list.size(); j++){
                    result[pointer] = list.get(j);
                    pointer++;
                }
            }
            else{
                continue;
            }
        }

        return result;
    }
}
