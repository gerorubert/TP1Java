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
public class Carro {
        // Atributos de la clase
    private String marca;
    private int modelo;
    private double precio;
    
    // Constructor de la clase
    public Carro(String marca, int modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    // Métodos de la clase
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: " + precio);
    }
    
    public double calcularImpuestos() {
        return precio * 0.1; // Impuesto del 10%
    }
}
