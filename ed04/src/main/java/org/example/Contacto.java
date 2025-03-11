package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SamuelRodrigoHernandez
 * @version 1.0 11/03/2025
 */
class Contacto {
    private String name;
    private List<String> phones;
    /**
     * @param: name Este atributo es el nombre del contacto.
     * @param: phones Este es un atributo pora una lista de telefonos con array.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * @return name devuelve el nombre del contacto.
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return devuelce la lista de telefonos.
     */

    public List<String> getPhones() {
        return this.phones;
    }
}