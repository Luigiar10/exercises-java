package bucles;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // Caja fuerte
        int passcode = 2001;
        int passcodeUser;
        int intentos = 0;

        Scanner datos = new Scanner(System.in);

        do {
            System.out.println("Ingrese la clave de la caja fuerte");
            passcodeUser = datos.nextInt();
            if (passcodeUser == passcode) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }
            intentos++;
            if (intentos == 3) {
                System.out.println("Lo sentimos has intentado muchas veces");
            }
            //System.out.println(intentos);
        } while (intentos <= 2);
    }
}
