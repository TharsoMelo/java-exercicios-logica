import java.util.Scanner;
import java.util.ArrayList;

public class Ex06 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> listaDeNomes = new ArrayList<>();
            int opcao;

            do {
                System.out.println("Selecione: 1. Adicionar Nome");
                System.out.println("Selecione: 2. Remover Nome");
                System.out.println("Selecione: 3. Exibir Nome");
                System.out.println("Selecione: 4. Pesquisar Nome");
                System.out.println("Selecione: 0. Sair");

                if (scanner.hasNextInt()) {
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                } else{
                    System.out.println("Informe uma opção válida!");
                    scanner.nextLine();
                    opcao = -1;
                    continue;
                }
                switch (opcao) {
                    case 1 ->{
                        System.out.println("Digite nome a adicionar: ");
                        String nomeAdicionar =  scanner.nextLine();
                        listaDeNomes.add(nomeAdicionar);
                        System.out.println(nomeAdicionar+ " Adicionado com sucesso! ");
                    }
                    case 2 -> {
                        if (listaDeNomes.isEmpty()) {
                            System.out.println("A lista está vazia");
                            break;
                        }
                        System.out.println("Digite o nome para ser removido:");
                        String nomeRemover = scanner.nextLine();
                        if (listaDeNomes.remove(nomeRemover)) {
                            System.out.println(nomeRemover+ " Removido com sucesso!");
                        }else {
                            System.out.println("Erro!" + nomeRemover + " não encontrado na lista");
                        }
                    }
                    case 3 -> {
                        if (listaDeNomes.isEmpty()) {
                            System.out.println("A lista está vazia.");
                        }else {
                            for (String nome : listaDeNomes) {
                                System.out.println("-"+nome);
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("Digite nome a pesquisar:");
                        String nomePesquisar = scanner.nextLine();
                        if (listaDeNomes.contains(nomePesquisar)) {
                            System.out.println("O nome está na lista.");
                        }else {
                            System.out.println("O nome não está na lista.");
                        }
                    }
                    case 0 -> 
                    System.out.println("Programa encerrado!");
                    default -> System.out.println("Opção inválida. Tente novamente:");
                }
            }while (opcao != 0); {
                
            }
        }

    }
}
