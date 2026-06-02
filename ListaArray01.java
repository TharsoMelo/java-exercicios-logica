import java.util.Scanner;

public class ListaArray01 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];
            System.out.println("Informe 10 numero inteiros: "); 
            for (int i = 0; i < 10; i++) {
                System.out.println("Número" + (i+1) + ":");
                numeros[i] = scanner.nextInt();
            }  
            for (int i = numeros.length -1; i >= 0; i--){
                System.out.println(numeros[i]);
            }    
        }
    }
}
