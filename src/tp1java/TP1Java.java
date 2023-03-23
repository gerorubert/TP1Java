/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1java;

/**
 *
 * @author Alumno
 */
public class TP1Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Creación del objeto carro1
        Carro carro1 = new Carro("Toyota", 2022, 30000);
        
        // Llamada a los métodos del objeto creado
        carro1.mostrarInformacion();
        System.out.println("Impuestos a pagar: " + carro1.calcularImpuestos());
    }
    
}
