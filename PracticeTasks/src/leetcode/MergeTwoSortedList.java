package leetcode;

public class MergeTwoSortedList {
    public static void main(String[] args) {
       ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
       ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

       ListNode merged = mergeTwoLists(list1, list2);
       printList(merged);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(), current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void printList (ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}

