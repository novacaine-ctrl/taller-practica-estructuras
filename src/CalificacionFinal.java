import java.util.Scanner;

public class CalificacionFinal {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificacion del primer parcial: ");
        double parcial1 = scanner.nextDouble();

        System.out.print("Ingrese la calificacion del segundo parcial: ");
        double parcial2 = scanner.nextDouble();

        System.out.print("Ingrese la calificacion del tercer parcial: ");
        double parcial3 = scanner.nextDouble();

        double definitiva = (parcial1 *0.3) + (parcial2 * 0.3) + (parcial3 * 0.4);
        String estado = (definitiva >= 3.0) ? "Aprobado" : "Reprobado";

        System.out.printf("La calificacion final es: %.2f%n", definitiva);
        System.out.println("Estado: " + estado);
        
        scanner.close();
}
}