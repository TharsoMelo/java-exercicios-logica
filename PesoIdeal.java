import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            String continuar;
            do {
                System.out.print("Informe a altura: ");
                double altura = scanner.nextDouble();
                System.out.print("Informe o peso: ");
                double pesoAtual = scanner.nextDouble();
                double pesoIdeal;
                String faixaAltura;

                if (altura <= 1.50) {
                    pesoIdeal = 50.0;
                    faixaAltura = "Até 1.50m";
                }
                else if (altura <= 1.90) {
                    pesoIdeal = 70.0;
                    faixaAltura ="De 1.51 até 1.90m";
                }
                else {
                    pesoIdeal
                }
            }
        }

    }
}
