import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int respuestasCorrectas,respuestasIncorrectas,respuestasEnBlanco;
        int notaFinal;


        System.out.print("Ingrese el número de respuestas correctas: ");
        respuestasCorrectas = scan.nextInt();

        System.out.print("Ingrese el número de respuestas incorrectas: ");
        respuestasIncorrectas = scan.nextInt();

        System.out.print("Ingrese el número de respuestas en blanco: ");
        respuestasEnBlanco = scan.nextInt();


        scan.close();


        int puntosPorRespuestasCorrectas = respuestasCorrectas * 5;

        int puntosPorRespuestasIncorrectas = respuestasIncorrectas * (-1);


        notaFinal = puntosPorRespuestasCorrectas + puntosPorRespuestasIncorrectas;

        System.out.println("La nota final del estudiante es: " + notaFinal);

    }
}
