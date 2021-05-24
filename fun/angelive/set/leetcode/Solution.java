package fun.angelive.set.leetcode;

import java.util.Set;
import java.util.TreeSet;

/**
 * 804. 唯一摩尔斯密码词
 * @Author: Angel
 * @Date: 2019/7/7.
 * @Description:
 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        Set<String> treeSet = new TreeSet<>();

        for (String word: words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(codes[word.charAt(i) - 'a']);
            }
            treeSet.add(sb.toString());
        }
        return treeSet.size();
    }
}
