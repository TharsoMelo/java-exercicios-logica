public class MaiorValorArray {
    public static void main(String[] args) {
        int[] numeros = {7,12,20,5,56};
        int maior = numeros [0];
        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }
        }
        System.out.println("O maior valor é: " + maior);
    }
}
