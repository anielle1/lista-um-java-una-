import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite a temperatura em graus fahrenheit:");
   
    Double temperaturaFh = scanner.nextDouble();
    Double temperatura= ((temperaturaFh-32) / 1.8);
    
    System.out.print("Temperatura em centígrados:" +(temperaturaFh-32/1.8));

    scanner.close();





        
    }


























}
