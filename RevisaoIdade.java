import java.util.Scanner;

public class RevisaoIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        String classificação;

        if (idade > 0 && idade <= 6) {
            classificação = "Primeira infância.";
        }else if (idade > 6 && idade <= 12) {
            classificação = "Pré adolescente.";
        }else if (idade > 12 && idade <=18) {
            classificação = "Adolescente.";
        }else if (idade > 18 && idade <= 60) {
            classificação = "Adulto.";
        }else if (idade > 60 && idade <= 80) {
            classificação = "Idoso";
        }else if (idade > 80) {
            classificação = "Super idoso.";
        }else {
            classificação = "Idade inválida.";
        }
        System.out.print(classificação);
    }
}
