import java.util.Scanner;

public class MediaDeNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota da 1ª uniddade: ");
        double unidade1 = scanner.nextDouble();
        System.out.print("Informe a nota da 2ª uniddade: ");
        double unidade2 = scanner.nextDouble();
        System.out.print("Informe a nota da 3ª uniddade: ");
        double unidade3 = scanner.nextDouble();
        System.out.print("Informe a nota da 4ª uniddade: ");
        double unidade4 = scanner.nextDouble();
        double media = (unidade1 + unidade2 + unidade3 + unidade4) / 4;
        System.out.printf("A média calculada foi: %.2f%n", media);
        if (media >= 7) {
            System.out.print("Aluno aprovado!");
        } else if (media < 7 && media >= 5) {
            System.out.print("Aluno em recuperação!");
            
        } else  {
            System.out.print("Aluno reprovado!");
        }
        scanner.close();
    }
}