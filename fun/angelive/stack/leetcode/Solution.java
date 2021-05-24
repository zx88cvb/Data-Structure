package fun.angelive.stack.leetcode;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = (Character) stack.pop();
                if(pop.equals('(') && c != ')'){
                    return false;
                }
                if(pop.equals('{') && c != '}'){
                    return false;
                }
                if(pop.equals('[') && c != ']'){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
