package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        double valorPesosColombianos = 3500;
        double cantidadUsd;
        double cantidadPesosColombianosConvertidos;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de dolares a convertir");
        cantidadUsd = datos.nextDouble();
        cantidadPesosColombianosConvertidos = cantidadUsd * valorPesosColombianos;
        System.out.println(cantidadPesosColombianosConvertidos);
    }
}
