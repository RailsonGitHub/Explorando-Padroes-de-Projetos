package atividadeFactory;

public class BibliotecaDaMeiaNoite implements Livro {
    private final String nome;

    public BibliotecaDaMeiaNoite(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTitulo() {
        return "A Biblioteca da Meia-Noite - " + nome;
    }
}