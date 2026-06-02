import java.util.ArrayList;

public class ArrayListFrutas {
    
    public static void main(String[] args) {
    ArrayList<String> frutas  = new ArrayList<>();
    System.out.println("frutas: ");
    frutas.add("maça");
    frutas.add("uva");
    frutas.add("pêra");
    frutas.add("banana");

   for (int i = 0; i < frutas.size(); i++){
 System.out.println(frutas.get(i));
}

ArrayList<String> nomes = new ArrayList<>();
    System.out.println("\nNomes: ");
    nomes.add("Nicoly");
    nomes.add("Tharso");
    nomes.add("Matheus");

   for (int i = 0; i < nomes.size(); i++){
 System.out.println(nomes.get(i));
     }

ArrayList<String> ferramentas = new ArrayList<>();
     System.out.println("\nFerramentas: ");
     ferramentas.add("Enxada");
     ferramentas.add("Colher de pedreiro");
     ferramentas.add("Pá");
     ferramentas.add("Esmerilhadeira");
     ferramentas.add("Picareta");

     for (String ferramenta : ferramentas){
        System.out.println(ferramenta);
     }


   }
}
