/* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num1, num2;
        double retorno = 0;
        System.out.println("Ingrese un numero: ");
        num1 = leer.nextDouble();
        System.out.println("Ingrese un segundo numero: ");
        num2 = leer.nextDouble();
        System.out.println("Ingrese que desea hacer:   ");
        System.out.println("Ingrese 1 si desea sumarlos: ");
        System.out.println("Ingrese 2 si desea restarlo:   ");
        System.out.println("Ingrese 3 si desea multiplicarlos:   ");
        System.out.println("Ingrese 4 si desea dividir el primero sobre el segundo:   ");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                retorno = sumar(num1, num2);
                break;
            case 2:
                retorno = restar(num1, num2);
                break;
            case 3:
                retorno = multiplicar(num1, num2);
                break;
            case 4:
                retorno = dividir(num1, num2);
                break;
            default:
                System.out.println("Solo del 1 al 4");
                break;
        }
        System.out.println("El resultado es: " + retorno);
    }

    ////
    public static double sumar(double primero, double segundo) {
        double retornar = primero + segundo;
        return retornar;
    }

    //
    public static double restar(double primero, double segundo) {
        double retornar = primero - segundo;
        return retornar;
    }

    //
    public static double multiplicar(double primero, double segundo) {
        double retornar = primero * segundo;
        return retornar;
    }

    //
    public static double dividir(double primero, double segundo) {
        double retornar = primero / segundo;
        return retornar;
    }
}
