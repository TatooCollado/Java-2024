/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej.crud.arraylist;

import java.util.ArrayList;
import java.util.Scanner;
public class EjCRUDArraylist {

    /**
     * Descripción:
     *
     * Crea un programa que permita gestionar una lista de estudiantes con sus
     * nombres. El programa debe permitir agregar estudiantes, eliminar un
     * estudiante por su nombre, y listar todos los estudiantes registrados.
     * Además, debe incluir una opción para buscar si un estudiante está
     * registrado en la lista.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> students = new ArrayList();
        int opcion;
        String estudiante="";
        do {
            System.out.println("\n--- Menú de Gestión de Estudiantes ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Listar todos los estudiantes");
            System.out.println("4. Buscar estudiante");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del estudiante\n");
                    estudiante=leer.nextLine();
                    students.add(estudiante);
                    System.out.println("El estudiante " + estudiante + " ha sido agregado.\n");
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del estudiante a eliminar");
                    estudiante = leer.nextLine();
                    if (students.remove(estudiante)) {
                        System.out.println("El estudiante " + estudiante + " ha sido eliminado");
                    } else {
                        System.out.println("Estudiante no encontrado");
                    }
                }
                case 3 -> {
                    System.out.println("Estudiantes registrados: \n");
                    for (String student : students) {
                        System.out.println(student);
                    }
                }
                case 4 -> {
                    System.out.println("Ingrese el estudiante a buscar");
                    estudiante=leer.nextLine();
                    if(students.contains(estudiante)){
                        System.out.println("El estudiante " + estudiante + " está registrado.\n");
                    }else{
                        System.out.println("El estudiante no se encuentra registrado\n");
                    }
                }
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Ingrese una opcion valida!");
            }
        } while (opcion != 5);
        leer.close();
    }

}
