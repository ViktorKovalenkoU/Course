package practice.practice2;

class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
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
        while (true) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    public boolean removeItem(ListItem item) {
        if (root == null || item == null) {
            return false;
        }
        ListItem currentItem = root;
        ListItem parent = null;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parent = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parent = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parent);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null && item.previous() == null) {
            if (parent != null) {
                if (parent.next() == item) {
                    parent.setNext(null);
                } else {
                    parent.setPrevious(null);
                }
            } else {
                root = null;
            }
        } else if (item.next() != null) {
            root = item.next();
        } else {
            root = item.previous();
        }
    }

    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
