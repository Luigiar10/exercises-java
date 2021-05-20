package sentencias_condicionales;

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        // Cuestionario
        int puntos = 0;
        String r1, r2, r3, r4, r5;
        Scanner respuestas = new Scanner(System.in);

        System.out.println("Cual es la capital de Colombia?");
        r1 = respuestas.nextLine();
        if (r1.equals("bogota")){
            System.out.println("Correcto!");
            puntos++;
        } else {
            System.out.println("Incorrecto!");
        }

        System.out.println("Nombre del rio mas largo de colombia?");
        r2 = respuestas.nextLine();
        if (r2.equals("rio magdalena")){
            System.out.println("Correcto!");
            puntos++;
        } else {
            System.out.println("Incorrecto!");
        }

        System.out.println("Numero de departamentos de colombia");
        r3 = respuestas.nextLine();
        if (r3.equals("32")){
            System.out.println("Correcto!");
            puntos++;
        } else {
            System.out.println("Incorrecto!");
        }

        System.out.println("apodo del estadio de la seleccion?");
        r4 = respuestas.nextLine();
        if (r4.equals("metropolitano")){
            System.out.println("Correcto!");
            puntos++;
        } else {
            System.out.println("Incorrecto!");
        }

        System.out.println("Capital de Cordoba");
        r5 = respuestas.nextLine();
        if (r5.equals("monteria")){
            System.out.println("Correcto!");
            puntos++;
        } else {
            System.out.println("Incorrecto!");
        }

        System.out.printf("Puntos finales: %d", puntos);
    }
}
