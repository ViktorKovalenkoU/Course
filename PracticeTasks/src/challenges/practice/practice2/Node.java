package challenges.practice.practice2;

class Node extends ListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightLink = item;
        return item;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return item;
    }

    @Override
    int compareTo(ListItem item) {
       if (item != null){
           return ((Comparable) this.value).compareTo(item.getValue());
       }
       return -1;

    }
}
