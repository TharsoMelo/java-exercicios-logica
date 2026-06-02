import java.util.Scanner;

public class MaiorMenorWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        double venda;
        double maiorVenda = Double.MIN_VALUE;
        Double menorVenda = Double.MAX_VALUE;
        
       
        while (contador <= 10) {
            System.out.println("Venda " + contador + ": R$");
            venda = scanner.nextDouble();
            if (venda > maiorVenda) {
                maiorVenda = venda;
            }
            if (venda < menorVenda) {
                menorVenda = venda;
            }

            contador++;

        }
        System.out.printf("Maior Venda do dia: R$ %.2f%n", maiorVenda);
        System.out.printf("Maior Venda do dia: R$ %.2f%n", menorVenda);
        scanner.close();
    }
}