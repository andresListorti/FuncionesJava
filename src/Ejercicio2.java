/* 
    Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
      Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”. 
      
*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        String respuesta = "si";
        String nombre;
        int edad;

        Scanner leer = new Scanner((System.in));
        do {
            System.out.println("Ingrese el nombre: ");
            nombre = leer.nextLine();
            System.out.println("Ingrese la edad: ");
            edad = leer.nextInt();

            imprimirDatos(nombre, edad);
            System.out.println("Desea seguir imprimiendo datos: ");
            respuesta = leer.next();
            respuesta = respuesta.toLowerCase();
        } while (!(respuesta.equals("no")));
    }

    public static void imprimirDatos(String nom, int edad) {
        boolean mayor;
        if (edad >= 18) {
            mayor = true;

        } else {
            mayor = false;
        }
        System.out.println(nom + " es mayor de edad: " + mayor);
    }

}
