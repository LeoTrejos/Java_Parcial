
/*9. Ejercicio de Cálculo de Máximo Común Divisor (MCD):
Desarrolla un programa en Java que solicite al usuario ingresar dos números enteros
positivos y luego calcule y muestre su máximo común divisor (MCD).*/


import java.util.Scanner;

public class Exercise_Nine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String Name = input.nextLine();
        System.out.println("Welcome " + Name + "!");

        System.out.println("Please enter two positive integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("The maximum common divisor of " + num1 + " and " + num2 + " is: " + maxCommonDivisor(num1, num2));

        input.close();
    }

    public static int maxCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}