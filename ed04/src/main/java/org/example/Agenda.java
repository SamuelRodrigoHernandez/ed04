package org.example;

import java.util.List;

public interface Agenda {
    void addContact(String name, String phone);

    void removeContact(String name);

    void modifyPhoneNumber(String name, String oldPhone, String newPhone);

    List<Persona> getContacts();
}
