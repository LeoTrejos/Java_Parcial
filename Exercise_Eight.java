/*8. Ejercicio de Generación de Números Aleatorios con Suma:
Escribe un programa en Java que genere dos números enteros aleatorios entre 1 y 10 y
luego solicite al usuario ingresar la suma de esos dos números. El programa debe verificar
si la respuesta es correcta. */

import java.util.Scanner;
import java.util.Random;

public class Exercise_Eight {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String Name = input.nextLine();
        System.out.println("Welcome " + Name + "!");

        int num1 = random.nextInt(10) + 1; 
        int num2 = random.nextInt(10) + 1; 

        System.out.println("Please enter the sum of the following two numbers:");
        System.out.println(num1 + " + " + num2);

        int userSum = input.nextInt();

        int correctSum = num1 + num2;

        if (userSum == correctSum) {
            System.out.println("Correct! The sum is: " + correctSum);
        } else {
            System.out.println("Incorrect! The correct sum is: " + correctSum);
        }

        input.close();
    }
}