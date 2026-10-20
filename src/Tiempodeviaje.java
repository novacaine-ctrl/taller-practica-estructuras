import java.util.Scanner;

public class Tiempodeviaje {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diguite la cantidad de minutos: ");
        int minutosTotales = teclado.nextInt();
        
        int horas = minutosTotales / 60;
        int minutos = minutosTotales % 60;
        int segundos = 0;

        int segundosTotales = minutosTotales * 60;

        System.out.println("Tiempo ingresado: " + minutosTotales + "minutos");
        System.out.println("equivale" + horas + "horas" + minutos "minutos" + segundos + "segundos");
        System.out.println("En segundos" + segundosTotales + "segundos");
        
        scanner.close();

}
ñ}