package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Pedir dos numeros y mostrar resultados(+ - * /)
        int num1;
        int num2;
        int resultado;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        num1 = datos.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        num2 = datos.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }
}
