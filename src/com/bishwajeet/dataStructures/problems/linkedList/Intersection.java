package com.bishwajeet.dataStructures.problems.linkedList;

import java.util.List;

public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        // Get tail and size
        Result resultA = getTailAndSize(headA);
        Result resultB = getTailAndSize(headB);

        // If different tail nodes, No interaction
        if (resultA.tail != resultB.tail) {
            return null;
        }

        // Set pointers to the start of each linked list
        ListNode shorter = resultA.size < resultB.size ? headA : headB;
        ListNode longer = resultA.size < resultB.size ? headB : headA;

        // Advance the pointer to longer list by diff in length
        longer = getKthNode(longer, Math.abs(resultA.size - resultB.size));

        // Move both pointers until a collision
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }

        // Return either one
        return longer;
    }

    private ListNode getKthNode(ListNode head, int k) {
        ListNode current = head;
        while (k > 0 && current != null) {
            current = current.next;
            k--;
        }
        return current;
    }

    private Result getTailAndSize(ListNode head) {
        if (head == null) {
            return null;
        }

        int size = 1;
        ListNode current = head;
        while (current.next != null) {
            size++;
            current = current.next;
        }
        return new Result(current, size);
    }

    static class Result {
        public ListNode tail;
        public int size;
        public Result(ListNode tail, int size) {
            this.tail = tail;
            this.size = size;
        }
    }
}
