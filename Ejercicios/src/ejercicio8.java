import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dia,mes,año;
        int sumaDia,sumaMes,sumaAño;
        int numeroDeLaSuerte;


        System.out.print("Ingrese el día de nacimiento (dd): ");
        dia = scan.nextInt();

        System.out.print("Ingrese el mes de nacimiento (mm): ");
        mes = scan.nextInt();

        System.out.print("Ingrese el año de nacimiento (aaaa): ");
        año = scan.nextInt();


        scan.close();


        sumaDia = (dia / 10) + (dia % 10);


        sumaMes = (mes / 10) + (mes % 10);


        sumaAño = (año / 1000) + ((año / 100) % 10) + ((año / 10) % 10) + (año % 10);


        numeroDeLaSuerte = sumaDia + sumaMes + sumaAño;


        System.out.println("El número de la suerte es: " + numeroDeLaSuerte);

    }
}
