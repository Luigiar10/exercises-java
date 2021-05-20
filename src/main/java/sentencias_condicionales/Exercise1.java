package sentencias_condicionales;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Decir dia de la semana y responder con asignatura del dia

        String dia;

        Scanner datos = new Scanner(System.in);
        System.out.println("Que dia es hoy?");
        dia = datos.nextLine();

        switch (dia){
            case "Lunes":
                System.out.println("Toca Matematicas a primera hora");
                break;
            case "Martes":
                System.out.println("Toca Ingles a primera hora");
                break;
            case "Miercoles":
                System.out.println("Toca Religion a primera hora");
                break;
            case "Jueves":
                System.out.println("Toca Fisica a primera hora");
                break;
            case "Viernes":
                System.out.println("Toca Español a primera hora");
                break;
            case "Sabado":
                System.out.println("Hoy es sabado no hay escuela");
                break;
            case "Domingo":
                System.out.println("Hoy es domingo no hay escuela");
                break;
        }
    }
}
