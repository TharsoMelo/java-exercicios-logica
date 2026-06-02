import java.util.Scanner;

public class InformarMediaCondição {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a media: ");
        double media = scanner.nextDouble();
        if (media >= 7) {
            System.out.print("Aluno aprovado!");
        } else if (media < 7 && media >= 5) {
            System.out.print("Aluno em recuperação!");
        } else {
            System.out.print("Aluno reprovado!");
        }
        scanner.close();

    }
}
