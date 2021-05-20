package sentencias_condicionales;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        int num;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        num = datos.nextInt();
        if (num % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
