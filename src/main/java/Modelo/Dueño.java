/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class Dueño {
    private String nombre,telefono, direccion;
    private ArrayList<Mascota> mascotas;

    public Dueño() {
    }

    public Dueño(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.mascotas = mascotas;
        this.mascotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    public void registrarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }
    
    public void listarMascotas() {
        System.out.println("Mascotas de " + nombre + ":");
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota mascota = mascotas.get(i);
            System.out.println("- " + mascota);
        }
    }
    
}
