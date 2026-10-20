public public static void main(String[] args){
            Scanner scanner = new scanner ( system.in)

            System.out.println("ingresa el primer lado: ");
            double a = scanner.nextDouble()
            
            System.out.println("Inguesa el segundo lado: ");
            double b = scanner.nextDouble()

            System.out.println("Ingresa el tercer lado: ");
            double c = scanner.nextDouble()
            esvalido = (a + b > c) && (a + c > b) && (b + c > a)

            if (a == b && b== c){
                System.out.println("equilatero");
            } else if (a == b || b == c || a == c) {
            System.out.println("Isósceles");
            else {
            System.out.println("Escaleno");
        }
        scanner.close();
 {
    
}
