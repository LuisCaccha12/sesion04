/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase04;

/**
 *
 * @author Lenovo
 */
public class Clase04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Empleado empleado = new Empleado("Juan", "Perez", 30, "123456", "Ventas");
    Cliente cliente = new Cliente("María", "López", 25, "987654", "10");

    // Mostrar información de Empleado y Cliente
    System.out.println("Información del Empleado:");
    System.out.println("Nombre: " + empleado.getNombre() + ", Apellido: " + empleado.getApellido() +
            ", Edad: " + empleado.getEdad() + ", Código de Empleado: " + empleado.getCodempleado() +
            ", Área: " + empleado.getArea());

    System.out.println("Información del Cliente:");
    System.out.println("Nombre: " + cliente.getNombre() + ", Apellido: " + cliente.getApellido() +
            ", Edad: " + cliente.getEdad() + ", Código de Cliente: " + cliente.getCodcliente() +
            ", Cantidad de Compras: " + cliente.getCantcompras());
    }
    
}
