package sentencias_condicionales;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Pedir la hora y saludar dependiendo de ella

        int hora;
        Scanner datos = new Scanner(System.in);
        System.out.println("Que hora es?");
        hora = datos.nextInt();
        if (hora >= 6 && hora <= 12) {
            System.out.println("Bueos Dias!");
        } else if (hora >= 13 && hora <= 18) {
            System.out.println("Buenas Tardes!");
        } else if (hora >= 19 && hora <= 23) {
            System.out.println("Buenas Noches!");
        } else if (hora >= 24 || hora <= 5) {
            System.out.println("Es tarde!");
        }
    }
}
