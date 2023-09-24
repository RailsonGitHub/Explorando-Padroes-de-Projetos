package atividadeFactory;

public class FabricaEditoraUnesp implements Editora {
    @Override
    public Livro criarLivro() {
        return new DiscursoDeOdio(getNome());
    }

    @Override
    public String getNome() {
        return "Editora UNESP";
    }
}