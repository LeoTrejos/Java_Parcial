/*5. Ejercicio de Suma de Dígitos:
Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.

Luego, suma todos los dígitos del número y muestra el resultado.
Ejemplo: Usuario ingresa 12 → El programa retorna 3
SumDigitos = 1+2= 3 */

import java.util.Scanner;

public class Exercise_Five {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter name: ");
        String Name = input.nextLine();
        System.out.println("Welcome " + Name + "!");

        System.out.print(Name + ", Please enter a positive integer: ");
        int Number = input.nextInt();

        int Digit_Sum = sumDigits(Number);

        System.out.println(Name + ", The sum of the digits of the number " + Number + " is: " + Digit_Sum);

        input.close();
    }

    public static int sumDigits(int num) {
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }
}
