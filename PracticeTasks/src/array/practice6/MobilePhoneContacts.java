package array.practice6;

import java.util.ArrayList;

public class MobilePhoneContacts {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        Contact contact1 = Contact.createContact("Bob", "31415926");
        Contact contact2 = Contact.createContact("Alice", "16180339");
        Contact contact3 = Contact.createContact("Tom", "11235813");
        Contact contact4 = Contact.createContact("Jane", "23571113");

        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);

        mobilePhone.printContacts();

        Contact newContact = Contact.createContact("Alice", "12345678");
        mobilePhone.updateContact(contact2, newContact);

        mobilePhone.printContacts();

        mobilePhone.removeContact(contact3);

        mobilePhone.printContacts();
    }
}
