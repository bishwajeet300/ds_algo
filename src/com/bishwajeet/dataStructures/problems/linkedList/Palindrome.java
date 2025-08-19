package com.bishwajeet.dataStructures.problems.linkedList;

import java.util.Stack;

public class Palindrome {

    public boolean isPalindrome(ListNode head) {
        ListNode reversed_head = reverseAndClone(head);
        return isEqual(head, reversed_head);
    }

    public boolean isPalindrome_2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        Stack<Integer> stack = new Stack<>();


        // Push elements in Stack. 2 runners (slow & fast)
        while (fast != null && fast.next != null) {
            stack.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        // check for odd items, ignore middle element
        if (fast != null) {
            slow = slow.next;
        }

        // pop stack and compare with slow
        while (slow != null) {
            if (stack.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverseAndClone(ListNode head) {
        ListNode previous = null;

        while (head != null) {
            ListNode current = new ListNode(head.val);
            current.next = previous;
            previous = current;
            head = head.next;
        }
        return previous;
    }

    private boolean isEqual(ListNode head, ListNode reversed_head) {
        while (head != null && reversed_head != null) {
            if (head.val != reversed_head.val) return false;
            head = head.next;
            reversed_head = reversed_head.next;
        }
        return head == null && reversed_head == null;
    }
}
