package com.company.leetcode;

public class Solution2 {

    /**
     * 使用虚拟头结点
     * @param head head
     * @param val 值
     * @return 符合条件的ListNode
     */
    public ListNode removeNthFromEnd(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        //如果中间有相同元素
        ListNode prev = dummyHead;

        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return dummyHead.next;
    }
}
