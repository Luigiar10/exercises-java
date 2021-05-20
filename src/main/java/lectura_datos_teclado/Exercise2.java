package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        double valorUsd = 0.00027;
        double cantidadPesosColombianos;
        double cantidadUsdConvertidos;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de pesos a convertir");
        cantidadPesosColombianos = datos.nextDouble();
        cantidadUsdConvertidos = cantidadPesosColombianos * valorUsd;
        System.out.println(cantidadUsdConvertidos);
    }
}
