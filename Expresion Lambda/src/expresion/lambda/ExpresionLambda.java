/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresion.lambda;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class ExpresionLambda {

    /**
     * Crea una interfaz funcional llamada Operador, que tenga un método
     * calcular(int a, int b) que realice alguna operación matemática.
     * Implementa una expresión lambda para sumar y otra para multiplicar.
     */
    @FunctionalInterface
    interface Operador {

        int calcular(int a, int b);
    }

    public static void main(String[] args) {
        int d, f;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer valor: ");
        try {
            d = leer.nextInt();
        } catch (Exception e) {
            System.out.println("Por favor, ingrese un número válido.");
            return;
        }

        System.out.println("Ingrese el segundo valor: ");
        try {
            f = leer.nextInt();
        } catch (Exception e) {
            System.out.println("Por favor, ingrese un número válido.");
            return;
        }
        Operador suma = (a, b) -> a + b;
        Operador producto = (a, b) -> a * b;
        System.out.println("La suma es: " + suma.calcular(d, f) + "\n");
        System.out.println("El producto es: " + producto.calcular(d, f) + "\n");
    }

}
