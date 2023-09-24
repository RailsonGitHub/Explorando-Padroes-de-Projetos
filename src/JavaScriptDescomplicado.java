package atividadeFactory;

public class JavaScriptDescomplicado implements Livro {
    private final String nome;

    public JavaScriptDescomplicado(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTitulo() {
        return "JavaScript Descomplicado - " + nome;
    }
}