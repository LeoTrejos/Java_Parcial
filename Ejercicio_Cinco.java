/*5. Ejercicio de Suma de Dígitos:
Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.

Luego, suma todos los dígitos del número y muestra el resultado.
Ejemplo: Usuario ingresa 12 → El programa retorna 3
SumDigitos = 1+2= 3 */

import java.util.Scanner;

public class Ejercicio_Cinco {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese el nombre: ");
        String Nombre = input.nextLine();
        System.out.println("¡Bienvenido " + Nombre + "!");

        System.out.print(Nombre + ", Por favor, ingresa un número entero positivo: ");
        int Numero = input.nextInt();

        int Suma_Digitos = sumarDigitos(Numero);

        System.out.println(Nombre + ", La suma de los dígitos del número " + Numero + " es: " + Suma_Digitos);

        input.close();
        
        
    }
   

    public static int sumarDigitos(int num) {
        int suma = 0;
        for (int i = num; i > 0; i /= 10) {
            suma += i % 10;
        }
        return suma;
        
    }
    
    
}
