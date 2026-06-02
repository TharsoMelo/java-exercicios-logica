import java.util.Scanner;

public class DesafioParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite um número interio: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite um número interio: ");
        int numero3 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3;
        System.out.println("A soma foi " + soma);

        
        
        if (soma % 2 == 0) {
            System.out.println("A soma é par");
        }else{
            System.out.println("A soma é impar");
        }


        if (soma == 0) {
            System.out.println("A soma é zero");
        }else if (soma > 0) {
            System.out.println("A soma é positiva");
        }else{
            System.out.println("A soma é negavita");
        }
        scanner.close();
    }
}
