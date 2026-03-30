class Solution {
    public boolean hasDuplicate(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            // if(map.containsKey(nums[i])){
            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);
        } 

        return false;
    }
}