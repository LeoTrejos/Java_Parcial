/*2. Ejercicio de Juego de Piedra, Papel o Tijeras:
Desarrolla un programa en Java que permita al usuario jugar al clásico juego
de Piedra, Papel o Tijeras contra la computadora. El programa debe solicitar al
usuario que elija una de las opciones (Piedra, Papel o Tijeras) y luego generar
aleatoriamente la elección de la computadora. Luego, el programa debe determinar
quién gana según las reglas del juego.*/

import java.util.Scanner;
import java.util.Random;

public class Exercise_Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to the Rock, Paper, Scissors game!");

        System.out.println("Please enter your name: ");
        String Name = scanner.nextLine();
        System.out.println("Welcome " + Name + "!");

        System.out.print("Choose an option (Rock, Paper, Scissors): ");
        String choiceUser = scanner.nextLine();

        int indexComputer = random.nextInt(3);
        String choiceComputer = options[indexComputer];

        System.out.println("The computer chooses: " + choiceComputer);

        if (choiceUser.equals(choiceComputer)) {
            System.out.println("It's a tie!");
        } else if ((choiceUser.equals("Rock") && choiceComputer.equals("Scissors")) ||
                   (choiceUser.equals("Paper") && choiceComputer.equals("Rock")) ||
                   (choiceUser.equals("Scissors") && choiceComputer.equals("Paper"))) {
            System.out.println("You won! Congratulations!");
        } else {
            System.out.println("Computer wins! Try again!");
        }
        
        scanner.close();
    }
}