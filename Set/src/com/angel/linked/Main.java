package com.angel.linked;

import com.angel.FileOperation;

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

        LinkedListSet<String> set = new LinkedListSet<>();
        for (String word: list) {
            set.add(word);
        }
        System.out.println("BST Total different words: "+ set.getSize());
    }
}
