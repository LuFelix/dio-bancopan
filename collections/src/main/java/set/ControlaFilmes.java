package set;
import java.util.*;

/**
 * Controlar filmes usando a Interface SET
 */
public class ControlaFilmes {
    public static void main(String[] args) {

        /**
         * Criação e adição e exibição de HashSet de filmes sem ordenação
         */
        Filme filme1 = new Filme("Indiana Jones e Templo da Perdição","Acao",102);
        Filme filme2 = new Filme("De volta para o Foturo","Ficção",105);
        Filme filme3 = new Filme("Bambi","Infantil",87);
        Set<Filme> setFilmes = new HashSet<>();
        setFilmes.add(filme1);
        setFilmes.add(filme2);
        setFilmes.add(filme3);
        setFilmes.add(filme1);
        System.out.println();
        System.out.println("--\t Criar e exibir Set de Filmes \t--");
        System.out.println(setFilmes);
        System.out.println();

        /**
         * Exibição um a um
         */
        System.out.println("--\t Exibição uma a um \t--");
        for ( Filme filme : setFilmes) System.out.println(filme.toString());

        /**
         * Criação e adição e exibição de um set de filmes com ordenação
         */
        Set<Filme> setFilmesLinked = new LinkedHashSet<>();
        {
            setFilmesLinked.add(new Filme("Indiana Jones e Templo da Perdição","Acao",102));
            setFilmesLinked.add(new Filme("De volta para o Foturo","Ficção",105));
            setFilmesLinked.add(new Filme("Bambi","Infantil",87));
            setFilmesLinked.add(new Filme("Homem de Ferro","Ação",87));
            setFilmesLinked.add(new Filme("Homem Aranha","Infantil",105));
            setFilmesLinked.add(filme1); //não aceita repetição
            System.out.println();
            System.out.println("--\t Criar e exibir LinkedHashSet de Filmes \t--");
            System.out.println(setFilmesLinked);
            System.out.println();
        }

        /**
         * Exibição um a um em ordem de inseção
         */
        System.out.println("--\t Exibição uma a um em ordem de inserção no LinkedHashSet\t--");
        for ( Filme filme : setFilmesLinked) System.out.println(filme.toString());

        /**
         * Exibição em ordem natural de duração. A classe implementa equals, hashcode e comparable
         */
        {
            System.out.println();
            System.out.println("--\t Exibição em ordem de duração com desempate no genero ");
            Set<Filme> treeSet = new TreeSet<>(setFilmesLinked);
            for (Filme filme : treeSet) System.out.println(filme.toString());
        }

        /**
         * Exibição em ordem Nome, Genero, Duração usando a classe Comparator.
         */
        {
            System.out.println();
            System.out.println("--\t Exibição em ordem Nome, Genero, Duração ");
            Set<Filme> treeSetOrder = new TreeSet<>(new ComparaFilmeNomeGeneroDuracao());
            System.out.println("TreeSet após criação");
            System.out.println(treeSetOrder);
            System.out.println("TreeSet após usar método addAll no HashSet");
            treeSetOrder.addAll(setFilmes);
            for (Filme filme : treeSetOrder) System.out.println(filme.toString());
            System.out.println();
            System.out.println("TreeSet após usar método addAll no LinkedHashSet");
            treeSetOrder.addAll(setFilmesLinked);
            for (Filme filme : treeSetOrder) System.out.println(filme.toString());
        }


    }
    /**
     * Criaçao da classe Filme com Comparable, Equals e HashCode
     */
    private static class Filme implements Comparable<Filme> {
        private String nome;
        private String genero;
        private Integer duracao;
        public Filme(String nome, String genero, Integer duracao) {
            this.nome = nome;
            this.genero = genero;
            this.duracao = duracao;
        }
        @Override
        public int compareTo(Filme filme) {
            int duracao = this.getDuracao().compareTo(filme.getDuracao());
            if (duracao!=0) return duracao;
            int genero = this.getGenero().compareTo(filme.getGenero());
            return genero;
        }
        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", duracao=" + duracao +
                    '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Filme filme = (Filme) o;
            return nome.equals(filme.nome) && Objects.equals(genero, filme.genero) && Objects.equals(duracao, filme.duracao);
        }
        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, duracao);
        }
        public Integer getDuracao() {
            return duracao;
        }
        public void setDuracao(Integer duracao) {
            this.duracao = duracao;
        }
        public String getGenero() {
            return genero;
        }
        public void setGenero(String genero) {
            this.genero = genero;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
    }

    /**
     * Implementação da interface Comparator para a Classe Filme
     */
    private static class ComparaFilmeNomeGeneroDuracao implements Comparator<Filme>{

        @Override
        public int compare(Filme f1, Filme f2) {
            int nome = f1.getNome().compareTo(f2.getNome());
            if(nome!=0)return nome;
            int genero = f1.getGenero().compareTo(f2.getGenero());
            if (genero!=0) return genero;
            return f1.getDuracao().compareTo(f2.getDuracao());
        }
    }
}
