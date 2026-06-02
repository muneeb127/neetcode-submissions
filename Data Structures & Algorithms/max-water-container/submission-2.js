class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let left = 0;
        let right = heights.length - 1;
        let max = 0;

        while(left < right){
            let h = Math.min(heights[left], heights[right]);
            let capacity =  h * (right - left);

            max = Math.max(capacity, max);

            if(heights[right] < heights[left]){
                right--;
            }
            else{
                left++;
            }
        }

        return max;
    }
}
