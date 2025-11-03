package leetcode;

import static leetcode.MergeTwoSortedList.printList;

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        System.out.println("Before reverse:");
        printList(head);

        System.out.println("\nAfter:");
        printList(swapPairs(head));
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null && head.next != null) {
         ListNode first = head;
         ListNode second = head.next;

         prev.next = second;
         first.next = second.next;
         second.next = first;

         prev = first;
         head = first.next;
        }
        return dummy.next;
    }
}
