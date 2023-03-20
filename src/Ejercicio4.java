/* Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique si es o no un
número primo, debe devolver true si es primo, sino false. Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.  */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double ingresado;
        boolean primo;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es o no primo: ");
        ingresado = leer.nextDouble();
        primo = primoONo(ingresado);
        System.out.println("El valor es primo: " + primo);

    }

    ////
    public static boolean primoONo(double param) {
        boolean primo = true;
        if (param == 0 || param == 1) {
            System.out.println("No es primo ni compuesto");
            primo = false;

        } else if (param == 2) {
            primo = true;
        } else {
            for (int i = 2; i <= param - 1; i++) {
                if (param % i == 0) {
                    primo = false;
                    break;
                } else {
                    primo = true;
                }
            }

        }
        return primo;

    }
}
