import java.util.Scanner;
public class ParOuImpar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.print("O número " + numero + " é par.");
        } else {
            System.out.print("O número " + numero + " é ímpar.");
        }
        scanner.close();
    }
}