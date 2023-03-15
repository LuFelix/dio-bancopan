package lists;
import java.util.*;

public class ControlaLists {
    public ControlaLists() {
    }

    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args) {
        //primeiraEtapa();
        //segundaEtapa();
        // terceiraEtapa();
        quartaEtapa();

    }

    /**
     * 1 -> Utilizar a interface List implementando ArrayList
     */
    private static void primeiraEtapa() {
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
     * 2 -> Receber notas, armazenar em uma lista, mostrar a menor,
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
        System.out.printf("Média das Notas: %.2f", aux);

        System.out.println("\n");
        System.out.println("--\t Fim da execução da segunda etapa \t--");
        System.out.println();
    }

    /**
     * 3 -> Receber uma lista de notas, iterar, remover elemento por valor,
     * remover elemento pelo indice
     */
    private static void terceiraEtapa() {
        System.out.println("--\t Terceira Etapa \t--");
        System.out.println();
        System.out.println("--\t Iterar sobre a Lista");

        List<Double> listaNotas = new ArrayList<Double>(List.of(7.7, 8.9, 4.5, 9.9, 6.7, 0d));
        Iterator<Double> iterator = listaNotas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
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
        while (iterator1.hasNext()) {
            if (iterator1.next() < 7d) {
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
                (listaNotas.isEmpty() ? "Sim" : "Nâo"));

        System.out.println("\n");
        System.out.println("--\t Fim da execução da terceira etapa \t--");
        System.out.println();
    }

    /**
     * 4 -> Ordenar listas utilizando a intefarce Comparable. Será criada uma classe para auxiliar no entendimento.
     */
    public static void quartaEtapa() {
        List<Gato> listaGatos = new ArrayList<Gato>();
        listaGatos.add(new Gato("Lolita", 7, "Calicó"));
        listaGatos.add(new Gato("Mio", 3, "Cinza"));
        listaGatos.add(new Gato("Chita", 9, "Preta"));
        listaGatos.add(new Gato("Bola de Neve", 5, "Preta"));
        listaGatos.add(new Gato("Bolota", 5, "Preta"));

        /**
         * Mostrar na ordem de inserção. A classe Interface List já exibe na ordem de inserção
         */
        {
            System.out.println();
            System.out.println("--\t Ordem de Inserção \t--");
            System.out.println(listaGatos.toString());
            System.out.println();
        }

        /**
         * Ordem aleatória: a classe ArrayList não dispõe de métodos. Para executar essa operação usaremos Collections
         */
        {
            System.out.println("--\t Ordem aleatória \t--");
            Collections.shuffle(listaGatos);
            System.out.println(listaGatos);
            System.out.println();
        }

        /**
         * Comparar
         */
        {
            System.out.println("--\t Comparação \t--");
            int compara = listaGatos.get(0).compareTo(listaGatos.get(1));
            System.out.println("O nome do primeiro gato é anterior ao do segundo? " + compara);

            compara = listaGatos.get(1).compareTo(listaGatos.get(0));
            System.out.println("O nome do segundo gato é anterior ao do primeiro? " + compara);

            compara = listaGatos.get(1).compareTo(listaGatos.get(1));
            System.out.println("O nome do segundo gato é anterior ao do primeiro? " + compara);

        }

        /**
         * Ordenação Natural (Nome emordem alfabética)
         * Para essa operação foi implementada a Interface Comparable na classe gato e utilizado
         * o método de comparação da Interface Collectios.
         */
        {
            System.out.println();
            System.out.println("--\t Lista Atual \t--");
            System.out.println(listaGatos);
            System.out.println();
            System.out.println("--\t Lista Ordenada(nome) \t--");
            Collections.sort(listaGatos);
            System.out.println(listaGatos);

        }

        /**
         * Encerramento 4 etapa
         */
        {
            System.out.println("\n");
            System.out.println("--\t Fim da execução da quarta etapa \t--");
            System.out.println();
        }

    }


    /**
     * Implementação da classe Gato para exemplificar os exercícios.
     */
    private static class Gato implements Comparable<Gato> {
        private String nome;
        private Integer idade;
        private String pelagem;

        /**
         * Construtor com os atributos
         *
         * @param nome
         * @param idade
         * @param pelagem
         */
        public Gato(String nome, Integer idade, String pelagem) {
            this.nome = nome;
            this.idade = idade;
            this.pelagem = pelagem;
        }


        public String getNome() {
            return nome;
        }

        public Integer getIdade() {
            return idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }

        public String getPelagem() {
            return pelagem;
        }

        public void setPelagem(String pelagem) {
            this.pelagem = pelagem;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        /**
         * O método compareTo é obrigatório na implementação da Interface Comparable. Usaremos a comparação de Strings
         * para da classe String para retornar -1 caso o nome seja anterior, 0 para nomes iguais e 1 caso o nome
         * seja posterior na ordem alfabática.
         *
         * @param gato
         * @return int -1(anterior) 0(iguais) 1(posterior)
         */
        @Override
        public int compareTo(Gato gato) {
            return this.getNome().compareToIgnoreCase(gato.getNome());
        }
        @Override
        public String toString() {
            return "Gato{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", pelagem='" + pelagem + '\'' +
                    '}';
        }
    }
    
}

