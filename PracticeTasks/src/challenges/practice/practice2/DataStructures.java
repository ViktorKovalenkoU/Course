package challenges.practice.practice2;

public class DataStructures {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(new Node(5));
        list.addItem(new Node(3));
        list.addItem(new Node(7));
        list.addItem(new Node(2));
        list.addItem(new Node(4));
        list.addItem(new Node(6));
        list.addItem(new Node(8));

        System.out.println("Linked List Traversal:");
        list.traverse(list.getRoot());

        SearchTree tree = new SearchTree(new Node(5));
        tree.addItem(new Node(3));
        tree.addItem(new Node(7));
        tree.addItem(new Node(2));
        tree.addItem(new Node(4));
        tree.addItem(new Node(6));
        tree.addItem(new Node(8));

        System.out.println("\nBinary Search Tree Traversal:");
        tree.traverse(tree.getRoot());
    }
}
