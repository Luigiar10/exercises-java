package bucles;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        String numeroIntroducido;
        int caracteres = 0;

        Scanner datos = new Scanner(System.in);
        System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
        numeroIntroducido = datos.nextLine();

        for (int i = 0; i < numeroIntroducido.length(); i++) {
            caracteres++;
        }
        System.out.printf("El numero tiene %d digito", caracteres);
    }
}
