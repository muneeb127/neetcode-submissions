class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length;
        int low = 1; int high = piles[n - 1];
        int minK = piles[n - 1];

        while(low <= high){
            int mid = low + (high - low) / 2;
            double timeSpent = 0;


            for(int j = 0; j < piles.length; j++){
                timeSpent += Math.ceil((double) piles[j] / mid);      
            }


            if(timeSpent > h){
                low = mid + 1;
            }
            else if(timeSpent <= h){
                minK = mid;
                high = mid - 1;
            }
        }

        return minK;
    }
}
