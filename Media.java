import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a nota da 1ª unidade: ");
        double unidade1 = scanner.nextDouble();

        System.out.print("Informe a nota da 2ª unidade: ");
        double unidade2 = scanner.nextDouble();

        System.out.print("Informe a nota da 3ª unidade: ");
        double unidade3 = scanner.nextDouble();

        System.out.print("Informe a nota da 4ª unidade: ");
        double unidade4 = scanner.nextDouble();

        double media = (unidade1 + unidade2 + unidade3 + unidade4) / 4;

        System.out.printf("A média calculada foi: %.2f%n", media);

        scanner.close();
    }
}
