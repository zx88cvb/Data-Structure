package com.company.leetcode;

import com.company.LinkedList;

/**
 删除链表中等于给定值 val 的所有节点。

 示例:

 输入: 1->2->6->3->4->5->6, val = 6
 输出: 1->2->3->4->5
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int val) {

        // 头部如果存在相同元素 则删除
        while (head != null && head.val == val ) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        //  如果后面没有元素 则返回null
        if (head == null) {
            return head;
        }

        //如果中间有相同元素
        ListNode prev = head;

        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }

        return head;
    }
}
