import java.util.Scanner;

public class Juros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do emprestimo: ");
        double valoralorEmprestimo = scanner.nextDouble();
        System.out.print("Digite o numero de meses: ");
        int Meses = scanner.nextInt();
        double taxaJuros = 0.05;
        double valorJuros = valoralorEmprestimo * taxaJuros * Meses;
        double totalPagar = valoralorEmprestimo + valorJuros;
        System.out.printf("Total a pagar aos %d meses: R$ %.2f%n", Meses, totalPagar);
        scanner.close();
        
    }
}