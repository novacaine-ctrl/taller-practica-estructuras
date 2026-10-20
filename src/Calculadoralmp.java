import java.util.Scanner;
public class Calculadoralmp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Su IMC es: %.2f%n", imc);
        
        if (imc < 18.5) {
            System.out.println("Categoria: Bajo peso");
        } else if (imc <= 24.9) {
            System.out.println("Categoria: Normal");
        } else if (imc <= 29.9) {
            System.out.println("Categoria: Sobrepeso");
        } else {
            System.out.println("Categoria: Obesidad");
        }

        scanner.close();
        {
    
}
}