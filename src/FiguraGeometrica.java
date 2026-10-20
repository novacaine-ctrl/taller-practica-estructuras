import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        system.out.print("ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();

        system.out.print("ingrese el radio del circulo: ");
        double radio = scanner.nextDouble();

        double areaRectangulo = base * altura;
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double perimetroRectangulo = 2 * (base + altura);
        double circunferencia = 2 * Math.PI * radio;

        System.out.printf("Area del rectangulo: %.2f%n", areaRectangulo);
        System.out.printf("perimetro del rectangulo: %.2f%n", perimetroRectangulo);
        System.out.printf("Area del circulo: %.2f%n", areaCirculo);
        
        scanner.close();

}
