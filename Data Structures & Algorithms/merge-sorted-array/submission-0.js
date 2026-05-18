class Solution {
    /**
     * @param {number[]} nums1
     * @param {number} m
     * @param {number[]} nums2
     * @param {number} n
     * @return {void} Do not return anything, modify nums1 in-place instead.
     */
    merge(nums1, m, nums2, n) {
        let indexM = m - 1;
        let indexN = n - 1;
        let totalIndex = m + n - 1;

        while(indexN >= 0){
            if(nums1[indexM] > nums2[indexN]){
                nums1[totalIndex] = nums1[indexM];
                indexM--;
            }
            else{
                nums1[totalIndex] = nums2[indexN];
                indexN--;
            }

            totalIndex--;
        }
    }
}
