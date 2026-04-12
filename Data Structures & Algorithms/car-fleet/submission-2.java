class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        int[][] cars = new int[position.length][2];
        Deque<Double> stack = new ArrayDeque<>();

        for(int i = 0; i < position.length; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> b[0] - a[0]);
        System.out.println("Cars: " + Arrays.deepToString(cars));

        for(int i = 0; i < cars.length; i++){
            double time = (double)(target - cars[i][0]) / cars[i][1];
            System.out.println("Time : " + time);

            if(stack.size() == 0 || time > stack.peek()){
                stack.push(time);
            }

        }
        System.out.println("Stack: " + stack.toString());
        return stack.size();
    }
}
