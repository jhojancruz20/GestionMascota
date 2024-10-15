/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class VeterinariaMain {
    public static void main(String[] args) {
        // Crear la veterinaria
        Veterinaria veterinaria = new Veterinaria();

        // Crear algunos dueños
        Dueño carlos = new Dueño("Carlos Ramírez", "123456789", "Calle 1 #23-45");
        Dueño ana = new Dueño("Ana Gómez", "987654321", "Calle 2 #34-56");

        // Registrar los dueños en la veterinaria
        veterinaria.registrarDueño(carlos);
        veterinaria.registrarDueño(ana);

        // Crear algunas mascotas y asociarlas con sus dueños
        Mascota fido = new Mascota("Fido", "Perro", 5, carlos);
        Mascota michi = new Mascota("Michi", "Gato", 2, carlos);
        Mascota luna = new Mascota("Luna", "Perra", 3, ana);

        // Mostrar las mascotas de Carlos Ramírez
        veterinaria.mostrarMascotasPorDueño("Carlos Ramírez");

        // Mostrar las mascotas de Ana Gómez
        veterinaria.mostrarMascotasPorDueño("Ana Gómez");

        // Intentar buscar un dueño no registrado
        veterinaria.mostrarMascotasPorDueño("Juan Pérez");
    }
}
