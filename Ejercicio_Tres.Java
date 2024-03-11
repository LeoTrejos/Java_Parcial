/*3. Ejercicio de Conversión de Moneda:
Escribe un programa en Java que permita al usuario convertir una cantidad de dinero
de una moneda a otra. El programa debe pedir al usuario ingresar la cantidad de dinero
en una moneda (por ejemplo, dólares) y la tasa de cambio a la otra moneda (por ejemplo,
euros). Luego, debe realizar la conversión y mostrar el resultado. */

import java.util.Scanner;

public class Ejercicio_Tres{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingresa el nombre: ")
        String Nombre = scanner.newLine();

        System.out.print(Nombre + ", Ingresa la cantidad de dinero a convertir: ");
        double cantidad = scanner.nextDouble();

        System.out.print(Nombre + ", Ingresa la tasa de cambio: ");
        double tasaCambio = scanner.nextDouble();

        double resultado = cantidad * tasaCambio;

        System.out.println(Nombre + ", La cantidad equivalente es: " + resultado);
    }
}