package atividadeFactory;

public class DiscursoDeOdio implements Livro {
    private final String nome;

    public DiscursoDeOdio(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTitulo() {
        return "Discurso de Ódio - " + nome;
    }
}