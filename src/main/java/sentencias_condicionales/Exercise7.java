package sentencias_condicionales;

import java.util.Scanner;

public class Exercise7 {
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
        System.out.printf("Su promedio de notas es %.1f", promedio);
    }
}
