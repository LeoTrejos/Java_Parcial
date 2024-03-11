/*2. Ejercicio de Juego de Piedra, Papel o Tijeras:
Desarrolla un programa en Java que permita al usuario jugar al clásico juego
de Piedra, Papel o Tijeras contra la computadora. El programa debe solicitar al
usuario que elija una de las opciones (Piedra, Papel o Tijeras) y luego generar
aleatoriamente la elección de la computadora. Luego, el programa debe determinar
quién gana según las reglas del juego.*/

import java.util.Scanner;
import java.util.Random;
public class Ejercicio_Dos{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"Piedra", "Papel", "Tijeras"};

        System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijeras!");

        System.out.println("Por favor ingrese el nombre: ");
        String Nombre = scanner.nextLine();
        System.out.println("¡Bienvenido " + Nombre + "!");

        System.out.print("Elige una opción (Piedra, Papel, Tijeras): ");
        String eleccionUsuario = scanner.nextLine();

        int indiceComputador = random.nextInt(3);
        String eleccionComputador = opciones[indiceComputador];

        System.out.println("El computador elige: " + eleccionComputador);

        if (eleccionUsuario.equals(eleccionComputador)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario.equals("Piedra") && eleccionComputador.equals("Tijeras")) ||
                   (eleccionUsuario.equals("Papel") && eleccionComputador.equals("Piedra")) ||
                   (eleccionUsuario.equals("Tijeras") && eleccionComputador.equals("Papel"))) {
            System.out.println("¡Ganaste! ¡Felicidades!");
        } else {
            System.out.println("¡El computador gana! ¡Inténtalo de nuevo!");
        }
        scanner.close();
    }
    
}