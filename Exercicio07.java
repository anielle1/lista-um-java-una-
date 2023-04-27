import java.util.Scanner;

public class Exercicio07 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o valor total das vendas:");
    double totalV = scanner.nextDouble();

    System.out.println("Informe o percentual das vendas:");
    double percV = scanner.nextDouble();

    System.out.println("Informe o salario fixo:");
    double fixoS = scanner.nextDouble();

    double salarioT = ((totalV * percV) / 100) + fixoS;
    
    System.out.println("Salario total:" + salarioT );

    scanner.close();

}


    
}
