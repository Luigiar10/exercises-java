package bucles;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // Mostrar tabla de multiplicar del numero introducido
        int num;
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingresa el numero que quieras concocer su tabla de multiplicar");
        num = datos.nextInt();
        for (int i = 0; i <= 10; i++) {
            int indice = i;
            int result = num * indice;
            System.out.printf("%d x %d = %d\n", num, indice, result);
        }
    }
}
