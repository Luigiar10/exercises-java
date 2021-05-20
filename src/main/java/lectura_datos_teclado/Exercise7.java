package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        double precio1;
        double precio2;
        double precio3;
        double precioTotal;
        Scanner precios = new Scanner(System.in);
        System.out.println("Introduzca el primer precio: ");
        precio1 = precios.nextDouble();
        System.out.println("Introduzca el segundo precio: ");
        precio2 = precios.nextDouble();
        System.out.println("Introduzca el tercer precio: ");
        precio3 = precios.nextDouble();
        precioTotal = precio1 + precio2 + precio3;
        System.out.printf("%.2f", precioTotal);
    }
}
