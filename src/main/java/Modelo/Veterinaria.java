/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author jhoja
 */
import java.util.ArrayList;

public class Veterinaria {
    private ArrayList<Dueño> duenios;

    // Constructor
    public Veterinaria() {
        this.duenios = new ArrayList<>();
    }

    // Registrar un dueño en el sistema
    public void registrarDueño(Dueño duenio) {
        duenios.add(duenio);
    }

    // Mostrar las mascotas de un dueño específico
    public void mostrarMascotasPorDueño(String nombreDueño) {
        for (Dueño duenio : duenios) {
            if (duenio.getNombre().equalsIgnoreCase(nombreDueño)) {
                duenio.listarMascotas();
                return;
            }
        }
        System.out.println("No se encontró al dueño: " + nombreDueño);
    }
}
