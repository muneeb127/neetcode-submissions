class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        // char[] stack = new char[];
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                stack.push(c);
            }
            else{
                if(stack.isEmpty() || map.get(stack.pop()) != c) return false;
            }
        }

        return (stack.size() == 0);
    }
}
