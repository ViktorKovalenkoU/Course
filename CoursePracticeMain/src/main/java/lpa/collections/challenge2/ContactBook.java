package lpa.collections.challenge2;

import java.util.*;

public class ContactBook {
    private Set<Contact> contacts = new HashSet<>();

    public boolean addContact(Contact contact) {
        return contacts.add(contact);
    }

    public boolean removeByEmail(String email) {
        return contacts.removeIf(c -> c.getEmail().equals(email));
    }

    public Contact findByPhone(String phone) {
        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                return contact;
            }
        }
        return null;
    }

    public List<Contact> getSortedByName() {
        List<Contact> list = new ArrayList<>(contacts);
        list.sort(Comparator.comparing(Contact::getName));
                return list;
    }

    public void printAll() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}