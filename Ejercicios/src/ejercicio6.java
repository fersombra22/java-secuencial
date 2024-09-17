import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String primerApellido, segundoApellido,nombre;
        char inicialNombre, inicialPrimerApellido, inicialSegundoApellido;

        System.out.print("Ingrese el nombre: ");
        nombre = scan.nextLine();

        System.out.print("Ingrese el primer apellido: ");
        primerApellido = scan.nextLine();

        System.out.print("Ingrese el segundo apellido: ");
        segundoApellido = scan.nextLine();


        inicialNombre = nombre.charAt(0);
        inicialPrimerApellido = primerApellido.charAt(0);
        inicialSegundoApellido = segundoApellido.charAt(0);

        System.out.printf("Las iniciales son: %c.%c.%c.%n",
                Character.toUpperCase(inicialNombre),
                Character.toUpperCase(inicialPrimerApellido),
                Character.toUpperCase(inicialSegundoApellido));
        scan.close();

    }
}
