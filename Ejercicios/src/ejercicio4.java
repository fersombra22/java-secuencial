import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.print("Ingrese la distancia entre los dos vehículos (en km): ");
        double distancia = scan.nextDouble();


        System.out.print("Ingrese la velocidad del vehículo más lento (en km/h): ");
        double velocidadLento = scan.nextDouble();


        System.out.print("Ingrese la velocidad del vehículo más rápido (en km/h): ");
        double velocidadRapido = scan.nextDouble();


        double velocidadDiferencial = velocidadRapido - velocidadLento;


        double tiempoHoras = distancia / velocidadDiferencial;


        double tiempoMinutos = tiempoHoras * 60;


        System.out.printf("El vehículo más rápido alcanzará al vehículo más lento en %.2f minutos.\n", tiempoMinutos);


        scan.close();

    }
}
