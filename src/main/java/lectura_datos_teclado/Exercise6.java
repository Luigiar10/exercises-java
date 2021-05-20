package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        // Formula area triangulo
        // area = base * altura / 2

        int base;
        int altura;
        int area;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca la base del triangulo: ");
        base = datos.nextInt();
        System.out.println("Introduzca la altura del triangulo: ");
        altura = datos.nextInt();
        area = base * altura / 2;
        System.out.println(area);
    }
}
