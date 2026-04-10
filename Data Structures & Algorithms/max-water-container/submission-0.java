class Solution {
    public int maxArea(int[] heights) {
        int left = 0; int right = heights.length - 1;
        int capacity = 0;

        while(left < right){
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            capacity = Math.max(capacity, height * width);

            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return capacity;
    }
}
