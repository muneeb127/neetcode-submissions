class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < tokens.length; i++){
            String c = tokens[i];

            if(!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/")){
                stack.push(Integer.parseInt(c));
            }
            else{

                System.out.println("Stack: " + stack.toString());
                int num1 = stack.pop();
                int num2 = stack.pop();
                int op;

                if(c.equals("+")) op = num2 + num1;
                else if(c.equals("-")) op = num2 - num1;
                else if(c.equals("*")) op = num2 * num1;
                else op = num2 / num1;

                stack.push(op);
            }
        }

        return stack.pop();

    }
}
