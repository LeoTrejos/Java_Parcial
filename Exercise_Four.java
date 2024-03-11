/*4. Ejercicio de Cálculo de Intereses Compuestos:
Desarrolla un programa en Java que permita calcular el monto final de una inversión
después de un cierto número de años, utilizando la fórmula de interés compuesto. El
programa debe pedir al usuario ingresar la cantidad inicial invertida, la tasa de interés anual
y el número de años. Luego, muestra el monto final.*/

import java.util.Scanner;

public class Exercise_Four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a name:");
        String Name = input.nextLine();

        System.out.print(Name + ", enter the initial amount invested: ");
        double principal = input.nextDouble();

        System.out.print(Name + ", enter the annual interest rate (in percent): ");
        double Annual_Interest_Rate = input.nextDouble() / 100;

        System.out.print(Name + ", enter the number of years: ");
        int Year_Number = input.nextInt();

        double Final_Amount = principal * Math.pow(1 + Annual_Interest_Rate, Year_Number);

        System.out.println("The final amount after " + Year_Number + " years is: " + Final_Amount);

        input.close();
    }
}

