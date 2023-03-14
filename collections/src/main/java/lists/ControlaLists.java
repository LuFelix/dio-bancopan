package lists;
import java.util.*;

public class ControlaLists {
    public ControlaLists() {
    }
    public static void main(String[] args) {
        //primeiraEtapa();
        //segundaEtapa();
        terceiraEtapa();

    }
    private static void primeiraEtapa(){
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
        System.out.println("--\t Exibe uma Lista de carros, exibe uma posição e, após, troca um elemento \t-- ");
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

    /**
     * Receber notas, armazenar em uma lista, mostrar a menor,
     * maior e média usando Collections Interface
     */
    private static void segundaEtapa() {
        System.out.println("--\t Segunda Etapa \t--");
        List<Double> listaNotas = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 3; ++i) {
            System.out.println("Insira uma nota: ");
            listaNotas.add(in.nextDouble());
        }

        System.out.println();
        System.out.println("--\t Menor das Notas \t--");
        System.out.println("Nota: " + Collections.min(listaNotas));
        System.out.println();
        System.out.println("--\t Maior das Notas \t--");
        System.out.println("Notas: " + Collections.max(listaNotas));
        System.out.println();
        System.out.println("--\t Média das Notas \t--");
        double aux = 0.0;
        for (int i = 0; i < listaNotas.size(); i++) {
            aux = aux + listaNotas.get(i);
        }
        aux /= listaNotas.size();
        System.out.printf("Média das Notas: %.2f" , aux);

        System.out.println("\n");
        System.out.println("--\t Fim da execução da segunda etapa \t--");
        System.out.println();
    }

    /**
     * Receber uma lista de notas, iterar, remover elemento por valor,
     * remover elemento pelo indice
     */
    private static void terceiraEtapa(){
        System.out.println("--\t Terceira Etapa \t--");
        System.out.println();
        System.out.println("--\t Iterar sobre a Lista");

        List<Double> listaNotas = new ArrayList<Double>(List.of(7.7,8.9,4.5,9.9,6.7,0d));
        Iterator<Double> iterator = listaNotas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            soma = soma + iterator.next();
        }
        System.out.println(listaNotas.toString());

        System.out.println();
        System.out.printf("Exibe a soma %.2f", soma);
        System.out.println();

        System.out.println();
        System.out.println("--\t Remove a primeira nota");
        listaNotas.remove(0);
        System.out.println(listaNotas);

        System.out.println();
        System.out.println("--\t Remove a nota 0");
        listaNotas.remove(0.d);
        System.out.println(listaNotas);

        System.out.println();
        System.out.println("--\t Remove as notas menores que 7");

        Iterator<Double> iterator1 = listaNotas.iterator();
        while (iterator1.hasNext()){
            if (iterator1.next()<7d){
                iterator1.remove();
            }
        }
        System.out.println(listaNotas);
        System.out.println();

        System.out.println("--\t Apagar a lista");
        listaNotas.clear();
        System.out.println("--\t Lista Atual ");
        System.out.println(listaNotas);

        System.out.println();
        System.out.println("--\t A lista está vazia? " +
                (listaNotas.isEmpty()?"Sim":"Nâo"));

        System.out.println("\n");
        System.out.println("--\t Fim da execução da terceira etapa \t--");
        System.out.println();
    }

    public static void quartaEtapa (){
    
    }
}