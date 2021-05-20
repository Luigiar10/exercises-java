package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // Formula: area = base * altura

        int base;
        int altura;
        int area;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca la base del rectangulo: ");
        base = datos.nextInt();
        System.out.println("Introduzca la altura del rectangulo: ");
        altura = datos.nextInt();
        area = base * altura;
        System.out.println(area);
    }
}
