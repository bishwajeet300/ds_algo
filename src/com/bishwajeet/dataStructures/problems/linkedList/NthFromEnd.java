package com.bishwajeet.dataStructures.problems.linkedList;

import java.util.Arrays;

public class NthFromEnd {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(10);
        int k = 10;
        System.out.println("args = " + nthFromEnd(listNode, k));
    }

    private static ListNode nthFromEnd(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p1 = dummyHead;
        ListNode p2 = dummyHead;

        for (int i = 1; i <= k + 1; i++) {
            if (p1 == null) return null;
            p1 = p1.next;
        }

        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p2.next = p2.next.next;
        return dummyHead.next;
    }
}
