class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++){
            int days = 0;

            for(int j = i + 1; j < temperatures.length; j++){
                if(temperatures[j] > temperatures[i]){
                    days++;
                    break;
                }
                else{
                    days++;
                    if((j == temperatures.length - 1)) days = 0;
                }
            }

            result[i] = days;
        }

        return result;
    }
}
