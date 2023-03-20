import java.util.Scanner;

public class Ej1guia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fraseIngresada;
        System.out.println("Ingrese frase a codificar: ");
        fraseIngresada = leer.nextLine();
        fraseIngresada = fraseIngresada.toLowerCase();
        String retorno = cambiar(fraseIngresada);
        System.out.println(retorno);
    }

    public static String cambiar(String frase) {
        String frase2 = "";
        String letra = "";
        for (int i = 0; i <= frase.length() - 1; i++) {
            if (frase.substring(i, i + 1).equals("a") || frase.substring(i, i +
                    1).equals("e") || frase
                            .substring(i, i + 1).equals("i")
                    || frase.substring(i, i + 1).equals("o")
                    || frase
                            .substring(i, i + 1).equals("u")) {
                switch (frase.substring(i, i + 1)) {
                    case "a":
                        letra = "@";
                        break;
                    case "e":
                        letra = "#";
                        break;
                    case "i":
                        letra = "$";
                        break;
                    case "o":
                        letra = "%";
                        break;
                    case "u":
                        letra = "^";
                        break;
                }
            } else {
                letra = frase.substring(i, i + 1);
            }
            frase2 = frase2.concat(letra);
        }
        return frase2;
    }
}
