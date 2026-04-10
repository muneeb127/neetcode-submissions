
class MinStack{
    // Creating a list of lists
    // to track the values in stack and minimum value at each point
    List<List<Integer>> stack = new ArrayList<>();
    
    public MinStack(){
        
    }

    public void push(int val){
        // if(stack.size() == 0){
        //     stack.add(Arrays.asList(val, val));
        // }
        // else{
        //     List<Integer> lastElement = stack.get(stack.size() - 1);

        //     int min = lastElement.get(1);

        //     if(min <= val){
        //         stack.add(Arrays.asList(val, min));
        //     }
        //     else{
        //         stack.add(Arrays.asList(val, val));
        //     }
        // }

        int min = stack.isEmpty() ? val : Math.min(stack.get(stack.size() - 1).get(1), val);
        stack.add(Arrays.asList(val, min));
    }

    public void pop(){
        stack.remove(stack.size() - 1);
    }

    public int top(){
        int top = stack.get(stack.size() - 1).get(0);
        return top;
    }

    public int getMin(){
        return stack.get(stack.size() - 1).get(1);
    }


}
