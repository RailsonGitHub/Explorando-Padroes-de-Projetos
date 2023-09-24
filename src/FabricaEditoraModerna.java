package atividadeFactory;

public class FabricaEditoraModerna implements Editora {
    @Override
    public Livro criarLivro() {
        return new DomCasmurro(getNome());
    }

    @Override
    public String getNome() {
        return "Editora Moderna";
    }
}