
/* Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no 
devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 € */
////
import java.util.Scanner;

//
public class Ejercicio3 {
    public static void main(String[] args) {
        double ingresado;
        String moneda;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor en Euros: ");
        ingresado = leer.nextDouble();
        System.out.println(
                "Escriba el nombre de la moneda a la cual desea hacer la conversion - Libras, Dolares o Yenes: ");
        moneda = leer.next();
        moneda = moneda.toLowerCase();
        convertidor(ingresado, moneda);
    }

    ////
    public static void convertidor(Double monto, String moneda) {
        double resultado;
        switch (moneda) {
            case "libras":
                resultado = monto * 0.86;
                System.out.println("El total en Libras es de: " + resultado);
                break;
            case "dolares":
                resultado = monto * 1.28611;
                System.out.println("El total en Dolares es de: " + resultado);
                break;
            case "yenes":
                resultado = monto * 129.852;
                System.out.println("El total en Yenes es de: " + resultado);
                break;
            default:
                System.out.println("Solo se covierten Libras, Dolares o Yenes");
                break;
        }
    }
}