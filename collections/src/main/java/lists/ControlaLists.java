package lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlaLists {
    public ControlaLists() {
    }

    public static void main(String[] args) {
        /**
         * Instancia uma Lista de Animais e confere os elementos
         */
        System.out.println("--\t Instancia a Lista de Animais e confere os elementos \t-- ");
        List<String> listaAnimais = new ArrayList<>();
        listaAnimais.add("Gato");
        listaAnimais.add("Peixe");
        listaAnimais.add("Cachorro");
        listaAnimais.add("Elefante");
        listaAnimais.add("Girafa");

        System.out.println("A lista contem Girafa? " + listaAnimais.contains("Girafa"));
        System.out.println("A lista contem Cachorro? ".concat(listaAnimais.contains("Cachorro") ? "Sim" : "Não"));
        System.out.println("A lista contem Baleia? ".concat(listaAnimais.contains("Baleia") ? "Sim" : "Não"));

        /**
         * Exibe uma Lista de carros em seguida exibe uma posiçãoapós, troca um elemento no fim troca um elemnto
         */
        System.out.println("--\t Exibe uma Lista de carros em seguida exibe uma posiçãoapós, troca um elemento no fim troca um elemnto \t-- ");
        List<String> listaCarros = new ArrayList<>();
        listaCarros.add("Fusca");
        listaCarros.add("Kombi");
        listaCarros.add("Bugre");
        listaCarros.add("Jipe");
        listaCarros.add("Supermini");
        System.out.println(listaCarros);
        System.out.println("Terceira posição: " + listaCarros.get(2));
        System.out.println();
        System.out.println("--\t Troca o elemento da terceira posição \t--");
        listaCarros.add(2, "Carajás");
        System.out.println(listaCarros);
        System.out.println("Terceira posição: " + listaCarros.get(2));
    }

    private static void mediaNotas() {
        System.out.println("--\t Média de Notas \t--");
        double aux = 0.0;
        List<Double> notas = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 6; ++i) {
            System.out.println("Insira uma nota: ");
            notas.add(in.nextDouble());
        }

        for (int i = 0; i < notas.size(); i++) {
            aux = aux + notas.get(i);
        }

        aux /= (double) notas.size();
        System.out.println("Media de Notas: " + aux);
    }
}