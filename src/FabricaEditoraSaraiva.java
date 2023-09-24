package atividadeFactory;

public class FabricaEditoraSaraiva implements Editora {
    @Override
    public Livro criarLivro() {
        return new BibliotecaDaMeiaNoite(getNome());
    }

    @Override
    public String getNome() {
        return "Editora Saraiva";
    }
}