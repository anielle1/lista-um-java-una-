import java.util.Scanner;
public class Exercicio01{
public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);

    System.out.println("Digite um numero!");
    Double numeroUm= scanner.nextDouble();
    
    System.out.println("Digite um numero!");
    Double numeroDois = scanner.nextDouble();
    Double mediaAritmetica = numeroUm + numeroDois / 2;

    System.out.println("Media Aritmetica:"+ (numeroUm + numeroDois)/2 );
    scanner.close();

}



















}