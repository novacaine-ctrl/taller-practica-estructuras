import java.util.Scanner;


public class AnioBisiesto {
    public static void main(String[] args) {
        boolean bisiesto;
        String nombreDia = "";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el anio: ");
        int anio = scanner.nextInt();

        bisiesto = (anio % 4 == 0) && 
                   (anio % 100 != 0 || anio % 400 == 0);


        System.out.println(anio + " " +
                (bisiesto ? "es bisiesto" : "no es bisiesto"));




        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = scanner.nextInt();


        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;

            case 2:
                nombreDia = "Martes";
                break;
            
            case 3:
                nombreDia = "Miércoles";
                break;

            case 4:
                nombreDia = "Jueves";
                break;

            case 5:
                nombreDia = "Viernes";  
                break;

            case 6:
                nombreDia = "Sábado";
                break;

            case 7:
                nombreDia = "Domingo";  
                break;

            default:
                System.out.println("Número de día inválido.");
        }
    }
    }
