import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int horas, minutos, segundos, tiempoDeViaje;
        int segundosTotalesDePartida, segundosTotalesDeLlegada;
        int horasDeLlegada, minutosDeLlegada, segundosDeLlegada;


        System.out.print("Ingrese la hora de partida (HH): ");
        horas = scan.nextInt();

        System.out.print("Ingrese los minutos de partida (MM): ");
        minutos = scan.nextInt();

        System.out.print("Ingrese los segundos de partida (SS): ");
        segundos = scan.nextInt();


        System.out.print("Ingrese el tiempo de viaje en segundos (T): ");
        tiempoDeViaje = scan.nextInt();


        segundosTotalesDePartida = horas * 3600 + minutos * 60 + segundos;


        segundosTotalesDeLlegada = segundosTotalesDePartida + tiempoDeViaje;


        horasDeLlegada = (segundosTotalesDeLlegada / 3600) % 24;
        minutosDeLlegada = (segundosTotalesDeLlegada % 3600) / 60;
        segundosDeLlegada = segundosTotalesDeLlegada % 60;


        System.out.printf("Hora de llegada: %02d:%02d:%02d%n", horasDeLlegada, minutosDeLlegada, segundosDeLlegada);


        scan.close();



    }
}
