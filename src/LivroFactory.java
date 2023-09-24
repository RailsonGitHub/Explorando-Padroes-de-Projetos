package atividadeFactory;

public class LivroFactory {
    public Livro criarLivro(Editora editora) {
        return editora.criarLivro();
    }
}