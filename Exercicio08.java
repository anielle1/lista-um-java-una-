import java.util.Scanner;
public class Exercicio08{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
   
    System.out.println("Quantidade de veiculos no estacionamento?");
    Double  veiculos = scanner.nextDouble();
    
    System.out.println("Quantidade de rodas no estacionamento?");
    Double rodas = scanner.nextDouble();

    Double numeroDeCarros = rodas - veiculos/4;
    Double numeroDeMotos = numeroDeCarros - veiculos;

    System.out.println("Quantidade de carros:"+ numeroDeCarros);
    System.out.println("Quantidade de motos:"+numeroDeMotos);

    scanner.close();



    
    }
}
