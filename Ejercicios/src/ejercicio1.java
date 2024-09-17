import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        double sueldoBase,venta1,venta2,venta3,comisionVenta1,comisionVenta2,comisionVenta3,
            totalComisiones,sueldoTotal;

        Scanner scan = new Scanner(System.in);


        System.out.print("Ingrese el sueldo base del vendedor: ");
        sueldoBase = scan.nextDouble();


        System.out.print("Ingrese el monto de la primera venta: ");
        venta1 = scan.nextDouble();

        System.out.print("Ingrese el monto de la segunda venta: ");
        venta2 = scan.nextDouble();
        System.out.print("Ingrese el monto de la tercera venta: ");
        venta3 = scan.nextDouble();
        comisionVenta1 = venta1 * 0.10;
        comisionVenta2 = venta2 * 0.10;
        comisionVenta3 = venta3 * 0.10;
        totalComisiones = comisionVenta1 + comisionVenta2 + comisionVenta3;
        sueldoTotal = sueldoBase + totalComisiones;
        System.out.println("Comisión por la primera venta: " + comisionVenta1);
        System.out.println("Comisión por la segunda venta: " + comisionVenta2);
        System.out.println("Comisión por la tercera venta: " + comisionVenta3);
        System.out.println("Total de comisiones: " + totalComisiones);
        System.out.println("Sueldo total (base + comisiones): " + sueldoTotal);
        scan.close();



    }
}
