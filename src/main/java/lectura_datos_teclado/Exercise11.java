package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        // Kilobyte to Megabyte
        // 1000:1
        int Mb = 1000;
        int Kb;
        int conversion;
        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de Kb");
        Kb = datos.nextInt();
        conversion = Kb / Mb;
        System.out.printf("%d Kilobytes corresponden a %d Megabytes", Kb, conversion);
    }
}
