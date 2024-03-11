/*3. Ejercicio de Conversión de Moneda:
Escribe un programa en Java que permita al usuario convertir una cantidad de dinero
de una moneda a otra. El programa debe pedir al usuario ingresar la cantidad de dinero
en una moneda (por ejemplo, dólares) y la tasa de cambio a la otra moneda (por ejemplo,
euros). Luego, debe realizar la conversión y mostrar el resultado. */

import java.util.Scanner;

public class Exercise_Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name: ");
        String Name = scanner.nextLine();

        System.out.print(Name + ", Please enter the amount of money to convert: ");
        double amount = scanner.nextDouble();

        System.out.print(Name + ", Enter the exchange rate: ");
        double exchangeRate = scanner.nextDouble();

        double result = amount * exchangeRate;

        System.out.println(Name + ", The equivalent amount is: " + result);

        scanner.close();
    }
}

