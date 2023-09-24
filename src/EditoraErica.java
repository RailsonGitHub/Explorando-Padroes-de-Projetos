package atividadeFactory;

public class EditoraErica implements Editora {
    @Override
    public Livro criarLivro() {
        return new JavaScriptDescomplicado(getNome());
    }

	@Override
	public String getNome() {
		return "Editora Erica";
	}
}
