package com.company.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 83. 删除排序链表中的重复元素

 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

 示例 1:

 输入: 1->1->2
 输出: 1->2
 示例 2:

 输入: 1->1->2->3->3
 输出: 1->2->3
 */
public class Solution3 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = list1;
        list2.remove(1);

        System.out.println(list1);
        System.out.println(list2);
    }
}
