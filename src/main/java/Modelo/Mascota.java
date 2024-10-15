/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Mascota {
    private String nombre,tipo;
    private int edad;
    private Dueño dueno;

    public Mascota() {
    }

    public Mascota(String nombre, String tipo, int edad, Dueño dueno) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.dueno = dueno;
        dueno.registrarMascota(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dueño getDueno() {
        return dueno;
    }

    public void setDueno(Dueño dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", tipo=" + tipo + ", edad=" + edad + ", dueno=" + dueno + '}';
    }
    
    
}
