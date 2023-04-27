import java.util.Scanner;

public class Exercicio09 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite um numero inteiro em segundos:");
double segundos = scanner.nextDouble();

double horas = segundos / 3600;
double minutos = segundos * 60;
double seg = segundos;

System.out.println("O resulta em"+ horas + " : " + minutos + " : " + seg );

scanner.close();


    
}


    
}
