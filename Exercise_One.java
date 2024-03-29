import java.util.Scanner;
/* 1. Ejercicio de Verificación de Año Bisiesto:
Crea un programa en Java que solicite al usuario ingresar un año y determine si es un año
bisiesto o no. Un año bisiesto es aquel divisible por 4, excepto aquellos divisibles por 100
pero no por 400. Por ejemplo, 2000 y 2400 son años bisiestos, mientras que 1800, 1900
y 2100 no lo son.  */

public class Exercise_One {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a name:");
        String Name = scanner.nextLine();

        System.out.print(Name + ", Please enter a year: ");
        int Year = scanner.nextInt();

        if ((Year % 4 == 0 && Year % 100 != 0) || Year % 400 == 0) {
            System.out.println(Name + ", the year is: " + Year + " is a leap year.");
        } else {
            System.out.println(Name + ", the year is: " + Year + " is not a leap year.");
        }
        scanner.close();
    }
}

