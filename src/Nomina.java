import java.util.Scanner;

public class Nomina {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese nombre:");
        String nombre = scanner.nexline();

        system.out.println("Inguese las horas trabajadas:");
        double hora = entrada.nextDouble();

        system.out.println("Inguese valor hora:");
        double Valorhora = entrada.nextDouble();

        system.out.println(
        "\nNOMINA BASICA\n" + "Nombre:" + nombre + "\n" +
        "Salario bruto :" (horas * Valorhora * 0.08) + "\n" +
        "Descuento :" + (horas * Valorhora * 0.05) + "\n" +
        "Salario neto:" + (horas *Valorhora * 0.08) - (horas * Valorhora * 0.05));

        scanner.close();
    }
}
