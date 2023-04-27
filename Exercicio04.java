import java.util.Scanner;

public class Exercicio04 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o capital:");
    double capital = scanner.nextDouble();

    System.out.println("Informe o prazo em meses:");
    double meses = scanner.nextDouble();

    System.out.println("Informe o juros:");
    double juros = scanner.nextDouble();
    
    double montante = capital * Math.pow (1+juros, meses);

    System.out.println("O montante será:" + meses);

    scanner.close();
    
}
    
}
