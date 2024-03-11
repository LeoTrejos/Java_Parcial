/*4. Ejercicio de Cálculo de Intereses Compuestos:
Desarrolla un programa en Java que permita calcular el monto final de una inversión
después de un cierto número de años, utilizando la fórmula de interés compuesto. El
programa debe pedir al usuario ingresar la cantidad inicial invertida, la tasa de interés anual
y el número de años. Luego, muestra el monto final.*/

import java.util.Scanner;

public class Ejercicio_Cuatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, ingresa un nombre:");
        String Nombre = scanner.nextLine();

        System.out.print("Ingrese la cantidad inicial invertida: ");
        double principal = input.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en porcentaje): ");
        double tasaInteresAnual = input.nextDouble() / 100;

        System.out.print("Ingrese el número de años: ");
        int numAnios = input.nextInt();

        double montoFinal = principal * Math.pow(1 + tasaInteresAnual, numAnios);

        System.out.println("El monto final después de " + numAnios + " años es: " + montoFinal);

        
    }
}

