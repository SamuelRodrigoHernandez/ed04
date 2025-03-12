package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una nueva agenda.
        org.example.agendaContacto agendaContacto = initAgenda();

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Contacto c : agendaContacto.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }

        // Añadir un nuevo teléfono a un contacto existente.
        agendaContacto.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        agendaContacto.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        agendaContacto.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Contacto c : agendaContacto.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }

    private static agendaContacto initAgenda() {
        agendaContacto agendaContacto = new agendaContacto();

        // Añadir contactos a la agenda.
        agendaContacto.addContact("John Doe", "1234567890");
        agendaContacto.addContact("Jane Doe", "9876543210");
        agendaContacto.addContact("Mary Jane", "1122334455");
        return agendaContacto;
    }
}