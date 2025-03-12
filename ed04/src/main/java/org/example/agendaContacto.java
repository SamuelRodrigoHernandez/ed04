package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @autor SamuelRodrigoHernandez.
 * @version 1.0 11/03/2025.
 */
public class agendaContacto {
    private List<Persona> contacts; // Lista de Persona

    /**
     * Crea una agenda de contactos con una lista de array.
     */
    public agendaContacto() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Añade un nuevo contacto, con una condición d eque si el contacto existe se rompa y si no existe se cree ese nuevo contacto.
     * @param name Aqui tiene una función en la cual llaman a name para saber si existe ese contacto en la agenda.
     * @param phone Y phone se añade si la condición lo permite y name no existe en la lista de array de la agenda.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * @param name Se llama a name para eliminar el conatacto.
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * @param name Si name es igual al nombre que especifiquen llama a la lista de telefonos para obtener su numero.
     * @param oldPhone Se crea un atributo con el antiguo telefono.
     * @param newPhone Se cmbia el antiguo telefono llamado anteriormente como index y se añade el nuevo telefono.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * @return Nos devuelve la lista de contactos.
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}