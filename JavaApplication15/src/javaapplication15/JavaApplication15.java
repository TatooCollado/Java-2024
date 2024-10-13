/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class JavaApplication15 {

    /**
     * pida al usuario su edad y determine si es mayor de edad o no, usando un
     * if-else y Scanner. Intenta también agregar un manejo de excepciones para
     * validar que se ingrese un número.
     */
    public static void main(String[] args) {
        int edad = 0;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su edad: \n");
        try {
            edad = leer.nextInt();

        } catch (Exception e) {
            System.out.println("Ingrese una edad correcta!");
        }
        if (edad >= 18) {
            System.out.println("Es mayor!\n");
            System.out.println("La edad es = " + edad);
        } else {
            if (edad != 0) {
                System.out.println("Es menor!");
                System.out.println("La edad es = " + edad);
            }

        }

    }

}
