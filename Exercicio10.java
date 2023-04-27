import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Informe um valor:");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Informe o valor:");
        double valor2 = scanner.nextDouble();

        System.out.println("Informe um valor:");
        double valor3 = scanner.nextDouble();

        double media = (valor1 + valor2 + valor3) / 3;
        System.out.println("A media aritmetica é:" + media);

        double mediaH = ( 3/ (1/valor1) + (1/valor2) + (1/valor3));
        System.out.println("A media harmonica é:" + mediaH);

        double mediaG = Math.sqrt((valor1 * valor2 * valor3));
        System.out.println("Informe a media geometrica:");
        

        scanner.close();

    }













    
}
