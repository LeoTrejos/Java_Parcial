/*7. Ejercicio de Ordenamiento de Números (sin utilizar arreglos):
Crea un programa en Java que solicite al usuario ingresar tres números enteros.
Luego, muestra los números en orden ascendente, utilizando condicionales para determinar
cuál es el mayor, el intermedio y el menor.*/

import java.util.Scanner;

public class Exercise_Seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String Name = input.nextLine();
        System.out.println("Welcome " + Name + "!");
        
        System.out.print(Name + ", Please enter three numbers: ");
        int Num1 = input.nextInt();
        int Num2 = input.nextInt();
        int Num3 = input.nextInt();
        
        if (Num1 > Num2) {
            if (Num1 > Num3) {
                System.out.println(Name + ", the largest number is: " + Num1);
            } else {
                System.out.println(Name + ", the largest number is: " + Num3);
            }
        } else {
            if (Num2 > Num3) {
                System.out.println(Name + ", the largest number is: " + Num2);
            } else {
                System.out.println(Name + ", the largest number is: " + Num3);
            }
        }
        
        input.close();
    }
}