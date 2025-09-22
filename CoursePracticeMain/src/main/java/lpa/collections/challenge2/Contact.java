package lpa.collections.challenge2;

import lpa.lambdas.Person;

import java.util.Objects;

public class Contact {
    private String name;
    private String email;
    private String phone;

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Contact)) return false;
        Contact contact = (Contact) o;
        return Objects.equals(email,contact.email);
    }
    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Contact:\n Name - " + name + ", email - " + email + ", phone number - " + phone + ";";
    }
}
