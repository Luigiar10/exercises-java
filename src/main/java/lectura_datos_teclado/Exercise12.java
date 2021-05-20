package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        double precio;
        int iva = 19;
        double precioIva;
        double precioConIva;
        double precioPromocion;
        int promocionPorcentaje;
        double precioTotal;
        String promocion;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca la promocion del producto: ");
        promocion = datos.nextLine();
        System.out.println("Introduzca el precio del producto");
        precio = datos.nextDouble();

        if (promocion.equals("promo50")){
            promocionPorcentaje = 50;
            precioIva = precio * iva / 100;
            precioConIva = precio + precioIva;
            precioPromocion = precioConIva * promocionPorcentaje / 100;
            precioTotal = precio + precioIva - precioPromocion;
            System.out.printf("Precio: %.2f%n", precio);
            System.out.printf("Iva: %.2f%n", precioIva);
            System.out.printf("Promocion: %.2f%n", precioPromocion);
            System.out.printf("Precio a pagar: %.2f", precioTotal);
        } else if (promocion.equals("promo30")){
            promocionPorcentaje = 30;
            precioIva = precio * iva / 100;
            precioConIva = precio + precioIva;
            precioPromocion = precioConIva * promocionPorcentaje / 100;
            precioTotal = precio + precioIva - precioPromocion;
            System.out.printf("Precio: %.2f%n", precio);
            System.out.printf("Iva: %.2f%n", precioIva);
            System.out.printf("Promocion: %.2f%n", precioPromocion);
            System.out.printf("Precio a pagar: %.2f", precioTotal);
        } else if (promocion.equals("")) {
            promocionPorcentaje = 0;
            precioIva = precio * iva / 100;
            precioConIva = precio + precioIva;
            precioPromocion = precioConIva * promocionPorcentaje / 100;
            precioTotal = precio + precioIva - precioPromocion;
            System.out.printf("Precio: %.2f%n", precio);
            System.out.printf("Iva: %.2f%n", precioIva);
            System.out.printf("Promocion: %.2f%n", precioPromocion);
            System.out.printf("Precio a pagar: %.2f", precioTotal);
        }
    }
}
