/*6. Ejercicio de Generación de Patrón de Asteriscos:
Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.
Luego, muestra un patrón de asteriscos como el siguiente ejemplo, donde cada fila tiene el
mismo número de asteriscos que el número ingresado:
Ejemplo: Pista: Pueden usar un ciclo For y el caracter de salto de linea \n
Si el usuario ingresa 4:
*
**
***
**** */

import java.util.Scanner;

public class Exercise_Six {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a positive integer: ");
        int Number = input.nextInt();

        for (int i = 0; i < Number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}