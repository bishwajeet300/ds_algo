package com.bishwajeet.dataStructures.problems.linkedList;

public class Partition {

    public ListNode partitionWithoutMaintainingSequence(ListNode head) {
        ListNode start = head;
        ListNode end = head;
        int pos = 0;

        while (head != null) {
            ListNode next = head.next;

            if (pos%2 != 0) {
                head.next = start;
                start = head;
            } else {
                end.next = head;
                end = head;
            }
            head = next;
            pos++;
        }
        end.next = null;

        return start;
    }

    public ListNode partitionWhileMaintainingSequence(ListNode head) {
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;

        int pos = 0;

        while (head != null) {
            ListNode next = head.next;
            head.next = null;
            if (pos%2 != 0) {
                // Odd -> Start of list
                if (beforeStart == null) {
                    beforeStart = head;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = head;
                    beforeEnd = head;
                }
            } else {
                // Even -> End of list
                if (afterStart == null) {
                    afterStart = head;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = head;
                    afterEnd = head;
                }
            }
            head = next;
            pos++;
        }

        if (beforeStart == null) {
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode start = head;
        ListNode end = head;
        int pos = 0;

        while (head != null) {
            ListNode next = head.next;

            if (pos%2 != 0) {
                head.next = start;
                start = head;
            } else {
                end.next = head;
                end = head;
            }
            head = next;
            pos++;
        }
        end.next = null;

        return start;
    }
}
