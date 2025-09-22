package lpa.collections.challenge3;

public class Challenge3 {
    public static void main(String[] args) {
        UniqueNameStore store1 = new UniqueNameStore(false);
        store1.addName("Viktor");
        store1.addName("Bob");
        store1.addName("Alice");
        System.out.println("Insertion order: " + store1.listAll());

        UniqueNameStore store2 = new UniqueNameStore(true);
        store2.addName("Charlie");
        store2.addName("Alice");
        store2.addName("Valex");
        System.out.println("Sorted order: " + store2.listAll());
    }
}
