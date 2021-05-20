package sentencias_condicionales;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int valorHoraNormal = 12;
        int valorHoraExtendida = 16;
        int numeroHorasExtras;
        int numeroHorasTrabajadas;
        double salarioHorasTrabajadas;
        double salarioHorasExtendidasTrabajadas;
        double salarioTotal;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introduzca las horas trabajadas");
        numeroHorasTrabajadas = datos.nextInt();
        if (numeroHorasTrabajadas > 40){
            numeroHorasExtras = numeroHorasTrabajadas - 40;
            salarioHorasTrabajadas = 40 * valorHoraNormal;
            salarioHorasExtendidasTrabajadas = numeroHorasExtras * valorHoraExtendida;
            salarioTotal = salarioHorasTrabajadas + salarioHorasExtendidasTrabajadas;
            System.out.printf("Su salario es de %.2f dolaes", salarioTotal);
        } else {
            salarioHorasTrabajadas = numeroHorasTrabajadas * valorHoraNormal;
            salarioTotal = salarioHorasTrabajadas;
            System.out.printf("Su salario es de %.2f dolares", salarioTotal);
        }
    }
}
