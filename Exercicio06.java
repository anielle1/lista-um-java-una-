import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero:");
        double numeroU = scanner.nextDouble();

        System.out.println("Informe um numero:");
        double numeroD = scanner.nextDouble();
        
        double result = Math.log(numeroU)/Math.log(numeroD);

        System.out.println("Logaritmo de " + numeroU + " na base " + numeroD + " = " + result);

        scanner.close();




        
    }
    
}
