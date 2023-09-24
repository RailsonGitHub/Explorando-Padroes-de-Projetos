package atividadeFactory;

public class DomCasmurro implements Livro {
    private final String nome;

    public DomCasmurro(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTitulo() {
        return "Dom Casmurro - " + nome;
    }
}