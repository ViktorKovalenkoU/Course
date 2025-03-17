package practice.practice2;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    public ListItem getRoot() {
        return root;
    }

    public boolean addItem(ListItem newItem) {
        if (root == null) {
            root = newItem;
            return true;
        }
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    newItem.setNext(root);
                    root.setPrevious(newItem);
                    root = newItem;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean removeItem(ListItem item) {
        if (item == null) {
            return false;
        }
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(currentItem.next());
                } else {
                    root = currentItem.next();
                }
                if (currentItem.next() != null) {
                    currentItem.next().setPrevious(currentItem.previous());
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }

    @Override
    public Node item(int index) {
        return null;
    }

    @Override
    public int getLength() {
        return 0;
    }
}