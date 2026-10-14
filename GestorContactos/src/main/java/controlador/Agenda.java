/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Contacto;

/**
 *
 * @author drogg
 */
public class Agenda {

    private Contacto[] contactos;
    private int capacidad;

    public Agenda() {
        this.contactos = new Contacto[100]; // Capacidad fija de 100 contactos
        this.capacidad = 0;
    }

    public void agregarContacto(Contacto contacto) {
        if (capacidad < contactos.length) {
            contactos[capacidad] = contacto;
            capacidad++;
        }
        
}
    public String buscarTelefono(String nombre) {
        for (int i = 0; i < capacidad; i++) {
            if (contactos[i] != null && contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                return contactos[i].getNumeroTel();
            }
        }
        return null;
    }
}

