package practice.practice2;

interface NodeList {
     ListItem getRoot();

     boolean addItem(ListItem item);

     boolean removeItem(ListItem item);

     void traverse(ListItem root);
}
