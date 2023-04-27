import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a quantidade de horas trabalhadas:");
    double horas = scanner.nextDouble();

    System.out.println("Informe o valor recebido por horas trabalhadas:");
    double valorH = scanner.nextDouble();

    System.out.println("Informe o valor do salario familia:");
    double valorS = scanner.nextDouble();

    System.out.println("Numero de filhos com idade abaixo de 14 anos:");
    double numeroDf = scanner.nextDouble();

    double salarioB = (horas * valorH) + (valorS * numeroDf);

    System.out.println("Valor do salario bruto de um empregado por um mes: " + salarioB);

    scanner.close();

    





    }

























    
}
