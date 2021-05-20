package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Pedir dos numeros y mostrar su multiplicacion
        int num1;
        int num2;
        int multiplicacion;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        num1 = datos.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2 = datos.nextInt();
        multiplicacion = num1 * num2;
        System.out.println(multiplicacion);
    }
}
