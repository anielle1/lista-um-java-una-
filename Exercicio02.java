import java.util.Scanner;
public class Exercicio02{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do produto:");
    Float valor = scanner.nextFloat();

    Double valorAcrescido = valor * 0.1;
   
    System.out.println("Valor Acrescido com 10%:" + (valor + valorAcrescido));

    scanner.close();


}
























}
