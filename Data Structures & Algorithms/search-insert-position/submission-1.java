class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target) return mid;
            else if (target < nums[mid]) right = mid - 1;
            else left = mid + 1;
        }

        // return (target > nums[mid]) ? left + 1 : right + 1;
        // System.out.println("Left Right: " + left + ", " + right);
        return left;
    }
}