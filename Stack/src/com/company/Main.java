package com.company;

import com.company.impl.StackImpl;
import com.company.leetcode.Solution;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        /*StackImpl<Integer> stack = new StackImpl<>();

        for(int i = 0 ; i < 5 ; i ++){
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);*/

        boolean ab = new Solution().isValid("{[]}");
        System.out.println(ab);
    }


}
