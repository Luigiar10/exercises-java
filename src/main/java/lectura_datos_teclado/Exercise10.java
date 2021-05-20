package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        // Megabyte to Kilobyte
        // 1:1000
        int Mb;
        int Kb = 1000;
        int conversion;
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de Mb");
        Mb = datos.nextInt();
        conversion = Mb * Kb;
        System.out.printf("%d Megabytes corresponden a %d Kilobytes", Mb, conversion);
    }
}
