/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package poo.repaso;
import Clases.Gato;
import Clases.Perro;
/**
 *
 * @author Ignacio
 */
public class POORepaso {

    /**
     * Como práctica, intenta crear una jerarquía de clases usando herencia y polimorfismo.
     * Por ejemplo, crea una clase abstracta Animal con un método hacerSonido(),
     * y luego crea subclases como Perro y Gato que implementen este método de forma diferente.
     */
    public static void main(String[] args) {
        Perro perrito = new Perro();
        Gato gatito = new Gato();
        gatito.hacerSonido();
        perrito.hacerSonido();
    }

}
