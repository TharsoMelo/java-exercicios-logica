import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para ver sua tabuada:");
        int numero = scanner.nextInt();
        int contador = 1;

        while (contador <=10) {
            System.out.println(numero+ "X" +contador+ "=" +(numero*contador));
            contador++;
        }
        scanner.close();
    }
}
