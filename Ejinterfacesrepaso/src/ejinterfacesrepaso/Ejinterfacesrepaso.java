/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejinterfacesrepaso;

/**
 *
 * @author Ignacio
 */
interface Electrodomestico {

    void encender();

    void apagar();
}

class Televisor implements Electrodomestico {

    @Override
    public void encender() {
        System.out.println("El televisor esta encendido!");
    }

    @Override
    public void apagar() {
        System.out.println("El televisor esta apagado!");
    }

}

class Computadora implements Electrodomestico {

    @Override
    public void encender() {
        System.out.println("La computadora esta encendida!");
    }

    @Override
    public void apagar() {
        System.out.println("La computadora esta apagada!");
    }

}

class Celular implements Electrodomestico {

    @Override
    public void encender() {
        System.out.println("El celular esta encendido!");
    }

    @Override
    public void apagar() {
        System.out.println("El celular esta apagado!");
    }

}

public class Ejinterfacesrepaso {

    /**
     * Se instancian los objetos y se listan
     */
    public static void main(String[] args) {
        Electrodomestico[] dispositivos = new Electrodomestico[3];
        dispositivos[0] = new Televisor();
        dispositivos[1] = new Computadora();
        dispositivos[2] = new Celular();
        for (Electrodomestico dispositivo : dispositivos) {
            dispositivo.encender();
            dispositivo.apagar();
        }
    }

}
