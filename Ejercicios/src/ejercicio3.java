import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
            double A,B,temp;

        Scanner scan = new Scanner(System.in);


        System.out.print("Ingrese el valor de A: ");
        A = scan.nextDouble();


        System.out.print("Ingrese el valor de B: ");
        B = scan.nextDouble();


        System.out.println("Valores iniciales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);


        temp = A;
        A = B;
        B = temp;

        // Mostrar los valores después del intercambio
        System.out.println("Valores después del intercambio:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Cerrar el scanner
        scan.close();



    }
}
