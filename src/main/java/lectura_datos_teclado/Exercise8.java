package lectura_datos_teclado;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        double valorHora = 12;
        int horasTrabajadas;
        double salarioTotalSemana;

        Scanner datos = new Scanner(System.in);
        System.out.println("Introuzca las horas trabajadas en la semana: ");
        horasTrabajadas = datos.nextInt();
        salarioTotalSemana = horasTrabajadas * valorHora;
        System.out.printf("Su salario de la semana es: %.2f dolares", salarioTotalSemana);
    }
}
