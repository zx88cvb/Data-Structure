package com.angel.bst;

import com.angel.FileOperation;
import com.angel.bst.BSTSet;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author angel
 * @Date 19-7-2
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        FileOperation.readFile("a-tale-of-two-cities.txt", list);
        System.out.println("Total words: " + list.size());

        BSTSet<String> set = new BSTSet<>();
        for (String word: list) {
            set.add(word);
        }
        System.out.println("BST Total different words: "+ set.getSize());
    }
}
