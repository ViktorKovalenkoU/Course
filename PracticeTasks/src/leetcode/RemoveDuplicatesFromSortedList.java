package leetcode;


public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        MyListNode head = new MyListNode(1, new MyListNode(2, new MyListNode(2, new MyListNode(3,
                new MyListNode(3, new MyListNode(4, new MyListNode(5, new MyListNode(5))))))));

        System.out.println(deleteDuplicates(head));

    }

    public static MyListNode deleteDuplicates(MyListNode head) {
        if (head == null) {
            return null;
        }
        MyListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}

class MyListNode {
    int val;
    MyListNode next;
    MyListNode() {}
    MyListNode(int val) { this.val = val; }
    MyListNode(int val, MyListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        MyListNode current = this;
        while (current != null) {
            sb.append(current.val);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }
}