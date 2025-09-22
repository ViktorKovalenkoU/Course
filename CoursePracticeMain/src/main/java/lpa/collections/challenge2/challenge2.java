package lpa.collections.challenge2;

public class challenge2 {
    public static void main(String[] args) {
        ContactBook book = new ContactBook();
        book.addContact(new Contact("Viktor", "viktor@email.com", "3801234567890"));
        book.addContact(new Contact("Alice", "alice@mail.com", "111"));
        book.addContact(new Contact("Bob", "bob@mail.com", "222"));
        book.addContact(new Contact("Charlie", "charlie@mail.com", "333"));
        book.addContact(new Contact("Alice2", "alice@mail.com", "999"));

        System.out.println("All contacts");
        book.printAll();
        System.out.println();

        System.out.println("Contact search by phone number");
        book.findByPhone("111");
        System.out.println();

        System.out.println("Sorted book by name");
        for (var contact : book.getSortedByName()) {
            System.out.println(contact);
        }
        System.out.println();

        System.out.println("Remove by email");
        book.removeByEmail("bob@mail.com");
        book.printAll();
    }
}
