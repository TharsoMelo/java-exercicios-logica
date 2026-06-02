import java.util.Scanner;

public class InversaoDeAlgorismos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero inteiro para ser invertido: ");
        int numero = scanner.nextInt();
        int invertido = 0;

        while (numero > 0) {
            int ultimo = numero % 10;
            invertido = invertido * 10 + ultimo;
            numero = numero / 10;
        }
        System.out.println("O numero invertido é: "+invertido);
        scanner.close();

    }
}
