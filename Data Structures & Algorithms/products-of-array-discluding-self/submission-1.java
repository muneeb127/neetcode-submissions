class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        Arrays.fill(output, 1);

        int product = 1;

        for(int i = 0; i < nums.length; i++){
            output[i] = product;
            product *= nums[i];
        }

        product = 1;

        for(int i = nums.length - 1; i >= 0; i--){
            output[i] *= product;
            product *= nums[i];
        }

        System.out.println("Output: " + Arrays.toString(output));


        // int[] prefix = new int[nums.length];
        // int[] suffix = new int[nums.length];
        // Arrays.fill(prefix, 1);
        // Arrays.fill(suffix, 1);

        // for(int i = 0; i < nums.length; i++){
        //     prefix[i] = product;
        //     product *= nums[i];
        // }

        // product = 1;

        // for(int i = nums.length - 1; i >= 0; i--){
        //     suffix[i] = product;
        //     product *= nums[i];
        // }

        // System.out.println("prefix: " + Arrays.toString(prefix));
        // System.out.println("suffix: " + Arrays.toString(suffix));

        // for(int i = 0; i < nums.length; i++){
        //     output[i] = suffix[i] * prefix[i];
        // }

        return output;
    }
}  
