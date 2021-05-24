package fun.angelive.set.leetcode;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * leetcode 349
 * @Author angel
 * @Date 19-7-14
 */
public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet hashSet = new HashSet();
        for (int num: nums1) {
            hashSet.add(num);
        }

        ArrayList<Integer> list = new ArrayList();
        for (int num: nums2) {
            if (hashSet.contains(num)) {
                list.add(num);
                hashSet.remove(num);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
            System.out.println(result[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] intersection = new Solution349().intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
    }
}
