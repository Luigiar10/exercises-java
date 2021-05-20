package sentencias_condicionales;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // Calcular promedio de notas
        double nota1;
        double nota2;
        double nota3;
        double promedio;

        Scanner notas = new Scanner(System.in);
        System.out.println("Introduzca la primera nota");
        nota1 = notas.nextDouble();
        System.out.println("Introduzca la segunda nota");
        nota2 = notas.nextDouble();
        System.out.println("Introduzca la tercera nota");
        nota3 = notas.nextDouble();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Su promedio de notas es %.1f%n", promedio);

        if (promedio >= 0.0 && promedio <= 2.9){
            System.out.println("Su desempeño es bajo");

        } else if (promedio >= 3.0 && promedio <= 3.9) {
            System.out.println("Su desempeño es basico");
        } else if (promedio >= 4.0 && promedio <= 4.4) {
            System.out.println("Su desempeño es alto");
        }  else if (promedio >= 4.5 && promedio <= 5.0) {
            System.out.println("Su desempeño es superior");
        } else {
            System.out.println("Ha ocurrido un error!");
        }
    }
}
