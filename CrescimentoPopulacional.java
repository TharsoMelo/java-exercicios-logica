import java.util.Scanner;

public class CrescimentoPopulacional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a população do país A: ");
        double populaçãoA = scanner.nextDouble();

        System.out.print("Informe a população do país B: ");
        double populaçãoB = scanner.nextDouble();
        int anos = 0;

        while (populaçãoA < populaçãoB) {
            populaçãoA += populaçãoA * 0.03;
            populaçãoB += populaçãoB * 0.015;

            anos++;
        }
        System.out.println("\nSerão necessário " + anos + " anos para que isso aconteça.");
        scanner.close();
    }
}
    