import java.util.Scanner;

public class ParOuImpar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite um número interio: ");
        int numero2 = scanner.nextInt();
        System.out.println(numero1 + numero2);
        int soma = numero1+numero2;
        System.out.println("A soma é " +soma);

        if (soma % 2 == 0) {
            System.out.println("O número " + soma + " é par.");
        }else { 
            System.out.println("O número " + soma + " é ímpar");
        }
        scanner.close();
    }
}
