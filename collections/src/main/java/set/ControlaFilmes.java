package set;
import java.util.HashSet;
import java.util.Set;

public class ControlaFilmes {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Acao","Indiana Jones e Templo da Perdição",102);
        Filme filme2 = new Filme("Ficção","De volta para o Foturo",105);
        Filme filme3 = new Filme("Infantil","Bambi",87);
        Set<Filme> setFilmes = new HashSet<>();
        setFilmes.add(filme1);
        setFilmes.add(filme2);
        setFilmes.add(filme3);
        setFilmes.add(filme1);
        System.out.println();
        System.out.println(setFilmes);

    }
    private static class Filme {
        private String genero;
        private String nome;
       private Integer duracao;

        public Filme(String genero, String nome, Integer duracao) {
            this.genero = genero;
            this.nome = nome;
            this.duracao = duracao;
        }

        @Override
        public String toString() {
            return "{" +
                    "genero='" + genero + '\'' +
                    "nome='" + nome + '\'' +
                    "duracao=" + duracao +
                    '}';
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
}
