package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        // Formula volumen de un cono
        // v = Npi * r2 * h / 3

        final double PI = 3.14;
        double radio;
        double altura;
        double volumen;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca el radio del cono: ");
        radio = datos.nextDouble();
        System.out.println("Introduzca la altura del cono: ");
        altura = datos.nextDouble();
        volumen = PI * radio * radio * altura / 3;
        System.out.printf("El volumen del cono es %.1f cm3", volumen);
    }
}
