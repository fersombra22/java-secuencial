import java.util.Scanner;


public class ejercicio2 {
    public static void main(String[] args) {
        double calificacion1,calificacion2,calificacion3,examenFinal,trabajoFinal;
        double promedioParciales,calificacionFinal;

        Scanner scan = new Scanner(System.in);


        System.out.print("Ingrese la primera calificación parcial: ");
        calificacion1 = scan.nextDouble();

        System.out.print("Ingrese la segunda calificación parcial: ");
        calificacion2 = scan.nextDouble();

        System.out.print("Ingrese la tercera calificación parcial: ");
        calificacion3 = scan.nextDouble();


        System.out.print("Ingrese la calificación del examen final: ");
        examenFinal = scan.nextDouble();


        System.out.print("Ingrese la calificación del trabajo final: ");
        trabajoFinal = scan.nextDouble();


        promedioParciales = (calificacion1 + calificacion2 + calificacion3) / 3;


        calificacionFinal = (0.55 * promedioParciales) + (0.30 * examenFinal) + (0.15 * trabajoFinal);


        System.out.printf("La calificación final del alumno es: %.2f\n", calificacionFinal);


        scan.close();

    }
}
